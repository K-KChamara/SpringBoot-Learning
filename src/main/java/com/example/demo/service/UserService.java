package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;
    NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }
    public void registerUser(User user) {
        if (userRepository.findByEmail(user.email) != null) {
            throw new IllegalArgumentException("User already exists");
        }
        userRepository.save(user);
        notificationService.send(user.name +", your registration successful",user.email);
    }
}
