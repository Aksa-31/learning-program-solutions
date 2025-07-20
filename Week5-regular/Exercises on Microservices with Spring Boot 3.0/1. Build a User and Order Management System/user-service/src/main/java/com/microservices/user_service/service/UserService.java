package com.microservices.user_service.service;

import com.microservices.user_service.model.User;
import com.microservices.user_service.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostConstruct
    public void init() {
        user.put(1L, new User(1L, "Aksa", "aksa@example.com"));
        user.put(2L, new User(2L, "Mathew", "mathew@example.com"));
    }

}
