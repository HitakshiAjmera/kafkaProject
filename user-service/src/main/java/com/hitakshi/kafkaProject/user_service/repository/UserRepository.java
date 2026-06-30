package com.hitakshi.kafkaProject.user_service.repository;

import com.hitakshi.kafkaProject.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
