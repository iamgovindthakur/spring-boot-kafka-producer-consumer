package com.iamgovindthakur.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "NewTopic", groupId = "group_id")
	public void consume(String message) {
		System.out.println("message = " + message);
	}
}
