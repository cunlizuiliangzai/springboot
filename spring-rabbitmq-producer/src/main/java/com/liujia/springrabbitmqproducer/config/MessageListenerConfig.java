package com.liujia.springrabbitmqproducer.config;

import com.liujia.springrabbitmqproducer.consumer.MyAckReceiver;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;

@Configuration
public class MessageListenerConfig {


    @Autowired
    private CachingConnectionFactory connectionFactory;
    @Autowired
    private MyAckReceiver myAckReceiver;//消息接收处理类

    private int listenerConsumer = 10;

    private int listenerMaxConsumer = 40;

    private int listenerPrefetchCount = 100;

    private int listenerThreadPool = 40;

    @Bean
    public SimpleMessageListenerContainer simpleMessageListenerContainer() {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory);
        container.setConcurrentConsumers(1);
        container.setMaxConcurrentConsumers(1);
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL); // RabbitMQ默认是自动确认，这里改为手动确认消息
        //设置一个队列
//        container.setQueueNames("TestDirectQueue");
        //如果同时设置多个如下： 前提是队列都是必须已经创建存在的
          container.setQueueNames("TestDirectQueue","fanout.A","topic.man");


        //另一种设置队列的方法,如果使用这种情况,那么要设置多个,就使用addQueues
        //container.setQueues(new Queue("TestDirectQueue",true));
        //container.addQueues(new Queue("TestDirectQueue2",true));
        //container.addQueues(new Queue("TestDirectQueue3",true));
        container.setMessageListener(myAckReceiver);

        return container;
    }

    /**
     *多消费者自动提交ack
     */
    @Bean
    public SimpleRabbitListenerContainerFactory autoAckRabbitListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setConcurrentConsumers(listenerConsumer);
        factory.setMaxConcurrentConsumers(listenerMaxConsumer);
        factory.setPrefetchCount(listenerPrefetchCount);
        factory.setTaskExecutor(Executors.newFixedThreadPool(listenerThreadPool));
        factory.setAcknowledgeMode(AcknowledgeMode.AUTO);
        //factory.setAutoStartup(false);
        return factory;
    }


}
