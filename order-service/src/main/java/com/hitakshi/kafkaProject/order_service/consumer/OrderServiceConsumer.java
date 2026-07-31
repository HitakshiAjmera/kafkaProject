package com.hitakshi.kafkaProject.order_service.consumer;

import com.hitakshi.kafkaProject.order_service.service.OrderEventPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceConsumer {

    private final OrderEventPublisher orderEventPublisher;

    public OrderServiceConsumer(OrderEventPublisher orderEventPublisher) {
        this.orderEventPublisher = orderEventPublisher;
    }

    @KafkaListener(topics = {"user-created-topic", "user-random-topic"})
    public void consumeUserServiceEvents(Object event) {
        processEvent("user-service", event);
    }

    @KafkaListener(topics = {"notification-created-topic", "notification-event-topic"})
    public void consumeNotificationServiceEvents(Object event) {
        processEvent("notification-service", event);
    }

    private void processEvent(String source, Object event) {
        if (event == null) {
            log.warn("Received null event from {}", source);
            return;
        }

        String payload = event instanceof String ? (String) event : event.toString();
        log.info("Processing event from {}: {}", source, payload);

        orderEventPublisher.publishOrderProcessed(source, payload);
    }
}
