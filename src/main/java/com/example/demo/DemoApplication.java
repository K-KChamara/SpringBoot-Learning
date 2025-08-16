package com.example.demo;

import com.example.demo.service.NotificationManager;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class  DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        NotificationManager notificationManager = context.getBean(NotificationManager.class);
        notificationManager.sendNotification("Hello World");


    }

}
