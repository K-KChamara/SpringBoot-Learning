package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message){
        System.out.println("SMS "+ message);
    }
}
