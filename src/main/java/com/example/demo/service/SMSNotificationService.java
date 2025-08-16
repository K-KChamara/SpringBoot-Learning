package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service()
public class SMSNotificationService{
    public void send(String message){
        System.out.println("SMS "+message);
    }
}
