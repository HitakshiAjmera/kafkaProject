package com.hitakshi.kafkaProject.user_service.event;

import lombok.Data;

@Data
public class UserCreatedEvent {
    private Long id;
    private String fullName;
    private String email;
}
