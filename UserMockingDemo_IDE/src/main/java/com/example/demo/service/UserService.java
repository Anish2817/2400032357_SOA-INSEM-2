package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUsers() {
        return "List of Users";
    }
}
