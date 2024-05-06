package com.example.demo27.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo27.domain.login;
import com.example.demo27.repository.LogRepo;
@Service
public class LogService {
    @Autowired

    private LogRepo rep;
    public login log(String username, String password)
    {
        login user=rep.findByUsernameAndPassword(username, password);
        return user;
    }
    
    
    

}