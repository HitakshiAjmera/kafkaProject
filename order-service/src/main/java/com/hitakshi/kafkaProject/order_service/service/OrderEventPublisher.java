package com.hitakshi.kafkaProject.order_service.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderEventPublisher {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${app.topics.order-processed:order-processed-topic}")
    private String orderProcessedTopic;

    public OrderEventPublisher(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishOrderProcessed(String source, Object event) {
        String payload = event instanceof String ? (String) event : event.toString();
        String message = source + ":" + payload;
        kafkaTemplate.send(orderProcessedTopic, message);
        log.info("Published order-processed event to topic {}: {}", orderProcessedTopic, message);
    }
}
