# Kafka Notification Service

## About the Project

This project demonstrates asynchronous communication between microservices using **Apache Kafka** and **Spring Boot**. It showcases how a producer publishes messages to a Kafka topic and how a consumer receives and processes those messages independently.

The application is divided into two services: a **Producer Service**, which publishes notification events, and a **Notification Service**, which consumes these events from Kafka. This approach enables reliable, scalable, and loosely coupled communication between services, making it suitable for event-driven microservice architectures.

---

## Tech Stack

- Java
- Spring Boot
- Spring Kafka
- Apache Kafka
- Maven
- Lombok
- REST APIs

---

## Project Structure

```
kafkaProject
├── notification-service
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   └── resources
│   │   └── test
│   └── pom.xml
│
├── producer-service
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   └── resources
│   │   └── test
│   └── pom.xml
│
└── docker-compose.yml
```

### Module Description

| Module | Responsibility |
|----------|----------------|
| **producer-service** | Publishes messages/events to Kafka topics |
| **notification-service** | Consumes Kafka messages and processes notifications |
| **docker-compose.yml** | Starts Kafka and required services using Docker |

---

## Features

- Event-driven communication using Apache Kafka
- Producer service for publishing messages
- Consumer service for processing messages
- Asynchronous message processing
- JSON message serialization and deserialization
- REST APIs for sending events
- Docker support for Kafka setup
- Loosely coupled microservice architecture

---

## What I Learned

During this project, I gained hands-on experience with:

- Integrating Apache Kafka with Spring Boot
- Building Kafka producers and consumers
- Publishing and consuming events asynchronously
- Configuring Kafka topics and consumer groups
- JSON serialization and deserialization of messages
- Event-driven microservice architecture
- Handling asynchronous communication between services
- Running Kafka using Docker
- Building loosely coupled and scalable backend applications

---

## Project Outcome

This project helped me understand how Apache Kafka enables reliable and asynchronous communication between microservices. It provided practical experience in developing producer and consumer applications using Spring Kafka, implementing event-driven workflows, and building scalable backend systems that can efficiently handle high volumes of messages.