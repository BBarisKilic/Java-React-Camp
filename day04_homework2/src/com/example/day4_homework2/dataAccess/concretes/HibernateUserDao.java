package com.example.day4_homework2.dataAccess.concretes;

import com.example.day4_homework2.dataAccess.abstracts.UserDao;
import com.example.day4_homework2.entities.concretes.User;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Added new user: " + user.getFirstName());
    }

    @Override
    public void update(User user) {

        System.out.println("User data updated: " + user.getFirstName());
    }

    @Override
    public void delete(User user) {
        System.out.println("User data deleted: " + user.getFirstName());
    }
}
