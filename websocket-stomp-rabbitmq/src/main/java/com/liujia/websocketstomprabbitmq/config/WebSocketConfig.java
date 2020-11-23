package com.liujia.websocketstomprabbitmq.config;

import com.liujia.websocketstomprabbitmq.interceptor.GetHeaderParamInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;


@Configuration
@EnableWebSocketMessageBroker   //这个注解作用是为了 是程序能够识别出 连接了 暴露的stomp节点 发送过来的 请求。 配合 @MessageMapping使用
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Autowired
    GetHeaderParamInterceptor getHeaderParamInterceptor;

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").setAllowedOrigins("*")
                .withSockJS();
        //暴露多个节点,就一样直接addEndpoint 就可以
//        registry.addEndpoint("/alone") .setAllowedOrigins("*")
//               .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {

        //如果不使用rabbitmq作为消息代理,那么只需要暴露简单节点即可
        // 默认的Simple Broker
        //   registry.enableSimpleBroker("/topic","/user");    //意思是在暴露的节点上，消息代理即将会处理 前缀为 /topic 和 /user 的请求消息
        //   registry.setApplicationDestinationPrefixes("/app");
        //   registry.setUserDestinationPrefix("/user")

        // 使用RabbitMQ做为消息代理，替换默认的Simple Broker
        //定义了服务端接收地址的前缀，也即客户端给服务端发消息的地址前缀,@SendTo(XXX) 也可以重定向

        registry.setUserDestinationPrefix("/user"); //这是给sendToUser使用,前端订阅需要加上/user

        registry.setApplicationDestinationPrefixes("/app"); //这是给客户端推送消息到服务器使用 ，推送的接口加上/app
        // "STOMP broker relay"处理所有消息将消息发送到外部的消息代理
        registry.enableStompBrokerRelay("/exchange", "/topic", "/queue", "/amq/queue")
                .setVirtualHost("JCChost") //对应自己rabbitmq里的虚拟host
                .setRelayHost("localhost")
                .setClientLogin("root")
                .setClientPasscode("root")
                .setSystemLogin("root")
                .setSystemPasscode("root")
                .setSystemHeartbeatSendInterval(5000)
                .setSystemHeartbeatReceiveInterval(4000);

    }

    /**
     * 采用自定义拦截器，获取connect时候传递的参数
     *
     * @param registration
     */
    @Override
    public void configureClientInboundChannel(ChannelRegistration registration) {
        registration.interceptors(getHeaderParamInterceptor);
    }
}