package com.example.demo.service;

public class User {
    public long id;
    public String email;
    public String name;
    public String password;

    public User(long id, String email, String name, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }
}
