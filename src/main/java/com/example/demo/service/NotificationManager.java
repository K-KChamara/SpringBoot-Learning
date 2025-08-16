package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Service
public class NotificationManager {

    @Value("${sample.api}")
    private String database;
    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void sendNotification(String message) {
        notificationService.send(message);
        System.out.println("Notification sent to " + database);
    }
}
