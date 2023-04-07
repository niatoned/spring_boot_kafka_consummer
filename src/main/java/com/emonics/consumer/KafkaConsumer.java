package com.emonics.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	@KafkaListener(topics = "MyTopic", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Kafka message from topic: " + message);
	}
}
