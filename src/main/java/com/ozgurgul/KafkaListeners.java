package com.ozgurgul;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafkaexp",
    groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received data: " + data );
    }
}
