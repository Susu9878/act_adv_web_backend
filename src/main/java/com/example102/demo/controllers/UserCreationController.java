package com.example102.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example102.demo.services.UserCreationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserCreationController {
    private final UserCreationService userCreationService;

    public UserCreationController(UserCreationService userCreationService){
        this.userCreationService = userCreationService;
    }

    @GetMapping("/create-user")
    public String createUser(@RequestParam String username, @RequestParam String email) {
        return userCreationService.guardarUsuario(username, email);
    }
    
}
