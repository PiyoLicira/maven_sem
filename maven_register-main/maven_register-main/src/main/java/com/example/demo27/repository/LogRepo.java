package com.example.demo27.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo27.domain.login;

@Repository
public interface LogRepo extends JpaRepository<login, String>
{
//login findByUserbaneAndPassword(String username,String password);

login findByUsernameAndPassword(String username, String password);

}