package com.hitakshi.kafkaProject.shipment_service.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShipmentService {

    public void createShipment(String orderEventMessage) {
        log.info("Creating shipment for order event: {}", orderEventMessage);
    }
}
