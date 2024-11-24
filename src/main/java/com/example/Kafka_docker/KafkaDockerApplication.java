package com.example.Kafka_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.Kafka_docker.*")
public class KafkaDockerApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaDockerApplication.class, args);
	}

}
