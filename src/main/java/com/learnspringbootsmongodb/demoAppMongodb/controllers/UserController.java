package com.learnspringbootsmongodb.demoAppMongodb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class UserController {
    @GetMapping("/")
    public String get () {
        return "hello";
    }
}