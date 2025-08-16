//package com.example.demo.service;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class AppConfig {
//    @Value("${notification.service.name}")
//    private String notificationService;

//    @Bean
//    public NotificationService notificationService() {
//        return new EmailNotificationService();
//    }
//
//    @Bean
//    public UserService notificationManager(){
//        return new UserService(notificationService());
//    }

//}
