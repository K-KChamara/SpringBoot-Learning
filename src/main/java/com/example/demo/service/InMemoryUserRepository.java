package com.example.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class InMemoryUserRepository implements UserRepository {
    public final HashMap<String, User> users;
    public InMemoryUserRepository() {
        this.users = new HashMap<>();
    }
    public void save(User user) {
        users.put(user.email, user);
        System.out.println("user saved : " + user.email);
    }
    public User findByEmail(String email) {
        return users.getOrDefault(email,null);
    }
}
