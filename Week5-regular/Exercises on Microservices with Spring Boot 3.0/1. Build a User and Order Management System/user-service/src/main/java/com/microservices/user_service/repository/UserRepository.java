package com.microservices.user_service.repository;

import com.microservices.user_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
