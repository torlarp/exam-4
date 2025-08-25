/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/Service.java to edit this template
 */
package com.demo.jwtexam.services;

import com.demo.jwtexam.en.User;
import com.demo.jwtexam.en.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 67112
 */
@Service
public class AccountService {
    
     @Autowired
    private  UserRepository userRepository;

 
    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }
    
     public User  getUsers() {
        List<User> users = new ArrayList<>();

        //userRepository.findAll().forEach(users::add);

        return new User();
    }
     
       public User  getUsers1() {
        List<User> users = new ArrayList<>();

        //userRepository.findAll().forEach(users::add);

        return new User();
    }
       
       public User  getUsers2() {
        List<User> users = new ArrayList<>();

        //userRepository.findAll().forEach(users::add);

        return new User();
    }
    
}
