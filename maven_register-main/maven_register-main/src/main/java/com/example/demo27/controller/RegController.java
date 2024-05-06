package com.example.demo27.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo27.domain.login;
import com.example.demo27.service.RegService;

@Controller
public class RegController {
    @Autowired
    private RegService service;

    @PostMapping("/reg")
    public String login(@ModelAttribute("user") login user) {
 
        service.saveUser(user.getUsername(), user.getPassword());
 
            return "redirect:/login";


}

@GetMapping("/login")
    public String api()
    {
 
        return "log";
    }

}