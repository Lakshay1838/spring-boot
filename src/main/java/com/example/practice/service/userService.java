package com.example.practice.service;

import com.example.practice.entity.User;
import com.example.practice.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class userService {

    @Autowired
    private userRepository ur1;

    public void addUser(User u){
        ur1.save(u);
    }
    public Optional<User> getUserById(Long id){
        return ur1.findById(id);
    }
}
