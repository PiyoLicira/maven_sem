package com.example.demo27.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo27.domain.login;
import com.example.demo27.service.LogService;
//import com.example.demo27.service.LogService;

@Controller
public class LogApplication {
 
    @Autowired
    private LogService service;
 
    @GetMapping("/")
    public String api()
    {
 
        return "log";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
 
    @PostMapping("/log")
    public String login(@ModelAttribute("user") login user) {
 
        login oauthUser = service.log(user.getUsername(), user.getPassword());
 
        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/disp";
        } else {
            return "redirect:/";
        }
    }
 
    @GetMapping("/disp")
    public String display() {
        return "display";
    }
}