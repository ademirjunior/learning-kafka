package com.ajzsolutions.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "${kafka.topic}")
    public void listen(Message<String> msg) {
        //apply your application logic to receive the message
        System.out.println(msg.getPayload());
    }
}
