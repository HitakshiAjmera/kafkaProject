package com.hitakshi.kafkaProject.shipment_service.consumer;

import com.hitakshi.kafkaProject.shipment_service.service.ShipmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShipmentServiceConsumer {

    private final ShipmentService shipmentService;

    public ShipmentServiceConsumer(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @KafkaListener(topics = "order-processed-topic")
    public void consumeOrderProcessed(String message) {
        log.info("Shipment service received order event: {}", message);
        shipmentService.createShipment(message);
    }
}
