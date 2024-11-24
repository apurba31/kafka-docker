package com.example.Kafka_docker.controller;

import com.example.Kafka_docker.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {
    private final KafkaProducerService kafkaProducerService;

    public KafkaController(KafkaProducerService producerService){
        this.kafkaProducerService=producerService;
    }
    @PostMapping("/publish")
    public String sendMessage(@RequestParam String topic, @RequestParam String message){
        kafkaProducerService.sendMessage(topic, message);
        return "Message sent to topic:" + topic;
    }
}
