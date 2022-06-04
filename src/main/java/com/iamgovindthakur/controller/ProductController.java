package com.iamgovindthakur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamgovindthakur.model.Product;

@RestController
@RequestMapping("kafka")
public class ProductController {

	@Autowired
	private KafkaTemplate<String, Product> kafkaTemplate;

	private static final String TOPIC = "Kafka_Example";

	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String name) {

		kafkaTemplate.send(TOPIC, new Product(name, "Electronics", 10000));

		return "Published successfully";
	}
}
