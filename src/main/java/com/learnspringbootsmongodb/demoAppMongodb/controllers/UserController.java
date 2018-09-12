package com.learnspringbootsmongodb.demoAppMongodb.controllers;

import com.learnspringbootsmongodb.demoAppMongodb.models.Users;
import com.learnspringbootsmongodb.demoAppMongodb.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UserController {
    private UserRepository userRepository;
    public UserController (UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
}