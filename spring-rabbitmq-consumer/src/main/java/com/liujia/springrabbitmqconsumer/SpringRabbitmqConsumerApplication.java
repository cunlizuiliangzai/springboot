package com.liujia.springrabbitmqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * DirectExchange是RabbitMQ的默认交换机，直接使用routingKey匹配队列
 */
@SpringBootApplication
public class SpringRabbitmqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRabbitmqConsumerApplication.class, args);
    }

}
