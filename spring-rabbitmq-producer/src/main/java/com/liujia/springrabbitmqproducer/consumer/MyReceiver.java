package com.liujia.springrabbitmqproducer.consumer;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MyReceiver {

    @RabbitListener(queues = "fanout.A", containerFactory = "autoAckRabbitListenerContainerFactory")
    public void processChargeOrderSettlementMessage(@Payload final Message message,
                                                    @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag, Channel channel) {

        new String(message.getBody());

    }

}
