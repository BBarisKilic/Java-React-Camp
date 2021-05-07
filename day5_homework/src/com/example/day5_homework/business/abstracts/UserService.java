package com.example.day5_homework.business.abstracts;

import com.example.day5_homework.entities.concretes.User;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    void addUserFromExternalService(String email, String password);
}
