package com.example.profile_service.profile_service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.profile_service.profile_service.model.Profile;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    
    @GetMapping("/{profileId}")
    public Profile getProfile(@PathVariable ("profileId") String profileId){

        List<String> post= new ArrayList<>();
        post.add("post1");
        post.add("post2");
        post.add("post3");

        List<String> notification= new ArrayList<>();
        notification.add("notification");
        notification.add("notificatio2");
        notification.add("notification3");

        return new Profile("1", post, notification);
    }
}
