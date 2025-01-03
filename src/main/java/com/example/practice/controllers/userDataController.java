package com.example.practice.controllers;

import com.example.practice.entity.User;
import com.example.practice.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/userController")
public class userDataController {

    @Autowired
    private userService userService1;

    @PostMapping
    public ResponseEntity<User> addNewUser(@RequestBody User u){
        userService1.addUser(u);

        Long id = u.getId();
        Optional<User> ou = userService1.getUserById(id);

        if(ou.isPresent()){
            return new ResponseEntity<>(ou.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

//    @GetMapping
//    public ResponseEntity<User>
}
