package com.pcs.management.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/authentication")
public class AuthenticationController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello you";
    }
}
