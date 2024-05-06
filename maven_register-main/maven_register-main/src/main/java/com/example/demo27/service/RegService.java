package com.example.demo27.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo27.domain.login;
import com.example.demo27.repository.LogRepo;

@Service
public class RegService {
@Autowired
private LogRepo userRepository;
public void saveUser(String username,String password){
    login user = new login();
    user.setUsername(username);
    user.setPassword(password);
    userRepository.save(user);
}
}
