package com.kafka.project.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "demoTopic",groupId = "myGroup")
    public void receiveMessage(String message){
        System.out.println("Message received "+message);
    }
}
