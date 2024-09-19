package com.example.user_service.user_service.model;

public class User {

    private String userID;
    private String userName;
    private String userPhoneNumber;
    private Profile profile;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public User(String userID, String userName, String userPhoneNumber, Profile profile) {
        this.userID = userID;
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.profile = profile;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

}

