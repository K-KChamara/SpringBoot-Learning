package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${notification.service.name}")
    private String notificationService;

    @Bean
    public NotificationService notificationService() {
        if (notificationService.equals("SMS"))
            return new SMSNotificationService();
        else
            return new EmailNotificationService();
    }

    @Bean
    public NotificationManager notificationManager(){
        return new NotificationManager(notificationService());
    }

}
