package com.example.day4_homework2.dataAccess.abstracts;

import com.example.day4_homework2.entities.concretes.User;

public interface UserDao {
    void add(User user);
    void update(User user);
    void delete(User user);
}
