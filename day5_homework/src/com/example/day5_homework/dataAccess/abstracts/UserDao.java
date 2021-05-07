package com.example.day5_homework.dataAccess.abstracts;

import com.example.day5_homework.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void update(User user);
    void delete(User user);
    List<User> getAll();
}
