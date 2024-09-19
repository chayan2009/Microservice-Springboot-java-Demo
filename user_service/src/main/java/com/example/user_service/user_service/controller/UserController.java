package com.example.user_service.user_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.user_service.user_service.model.Profile;
import com.example.user_service.user_service.model.User;


@RestController
@RequestMapping("/user")
public class UserController {
    
    @GetMapping(value = "/{userid}")
    public User getUser(@PathVariable("userid") String userId){

        User users=new User("1","chayan", "XXXXX",null);

        RestTemplate restTemplate=new RestTemplate();
        Profile profile=restTemplate.getForObject("http://localhost:8080/profile/1", Profile.class);
        users.setProfile(profile);
        return users;
    }
}