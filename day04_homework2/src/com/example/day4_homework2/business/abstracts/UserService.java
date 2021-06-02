package com.example.day4_homework2.business.abstracts;

import com.example.day4_homework2.entities.concretes.User;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
}
