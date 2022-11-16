package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "kafkaTopic", groupId ="group_id")
    public void consume(String message){
        System.out.println("received msg in group-group-id:"+message);
    }
}
