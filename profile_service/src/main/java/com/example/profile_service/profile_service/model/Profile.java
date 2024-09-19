package com.example.profile_service.profile_service.model;

import java.util.List;

public class Profile {
    
    private String profileId;
    private List<String> post;
    private List<String> notification;

    
    public Profile(String profileId, List<String> post, List<String> notification) {
        this.profileId = profileId;
        this.post = post;
        this.notification = notification;
    }
    
    public String getProfileId() {
        return profileId;
    }
    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }
    public List<String> getPost() {
        return post;
    }
    public void setPost(List<String> post) {
        this.post = post;
    }
    public List<String> getNotification() {
        return notification;
    }
    public void setNotification(List<String> notification) {
        this.notification = notification;
    }

    
    
}
