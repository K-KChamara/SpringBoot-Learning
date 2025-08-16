package com.example.demo.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service()
public class EmailNotificationService implements NotificationService {
    @Value("${mailServer.port}")
    private String port;
    @Value("${mailServer.host}")
    private String host;

    @PostConstruct
    public void startMailServer() {
        System.out.println("Starting mail server "+ host +":"+ port);
    }
    @Override
    public void send(String message, String recipientEmail){
        System.out.println("Email "+ message);
    }
}
