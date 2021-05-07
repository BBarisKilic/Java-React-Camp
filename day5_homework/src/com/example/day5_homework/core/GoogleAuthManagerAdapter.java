package com.example.day5_homework.core;

import com.example.day5_homework.entities.concretes.User;
import com.example.day5_homework.googleAuthentication.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements ExternalUserService{
    @Override
    public User getUserInformation(String email, String password) {
        GoogleAuthManager googleAuthManager = new GoogleAuthManager(email, password);
        return new User(googleAuthManager.getId(), googleAuthManager.getFirstName(), googleAuthManager.getLastName(), googleAuthManager.getEmail(), googleAuthManager.getPassword());
    }
}
