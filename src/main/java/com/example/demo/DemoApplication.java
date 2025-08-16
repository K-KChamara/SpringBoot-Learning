package com.example.demo;

import com.example.demo.service.User;
import com.example.demo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class  DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        UserService userService = context.getBean(UserService.class);
        User user = new User(1,"kasun@gmail.com","kasun chamara","kasun");
        userService.registerUser(user);
    }
}
