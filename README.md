# Kafka Project

This project is a small Spring Boot microservices example built around Apache Kafka. The idea is simple: one service creates an event, another service listens for it, and the work continues without blocking the original request.

I used this project to understand how event-driven systems work in practice, especially how different services can communicate with each other through Kafka topics instead of direct API calls.

## What this project does

The project currently includes a few services that demonstrate the basic flow of message-based communication:

- a user service that produces events
- a notification service that listens for those events
- an order service that handles incoming events and publishes follow-up events
- a shipment service that reacts to the order-processing event

This gives a simple end-to-end example of how an event can move through multiple services.

## Main technologies

- Java
- Spring Boot
- Spring Kafka
- Apache Kafka
- Maven
- Lombok

## Project structure

```text
kafkaProject
├── notification-service
├── user-service
├── order-service
├── shipment-service
└── README.md
```

## How the flow works

1. A service publishes a message to a Kafka topic.
2. Another service is subscribed to that topic.
3. The consumer receives the message and processes it.
4. In some cases, the service then publishes another event for the next step in the workflow.

For example, the order service can receive an event, process it, and then trigger a shipment-related event for the shipment service.

## Why this project is useful

This project helped me learn:

- how Kafka topics and consumer groups work
- how Spring Boot services can communicate asynchronously
- how event-driven architecture looks in a real setup
- how different services can stay loosely connected while still working together

## Running the services

Each service is a separate Spring Boot application. You can run them one by one after starting Kafka.

A typical flow would be:

1. start Kafka
2. run the producer or triggering service
3. run the consumer services
4. watch the events flow through the topics

## Notes

This is a learning project, so the implementation is intentionally simple. The focus is on understanding the pattern and structure rather than building a full production-ready system.
