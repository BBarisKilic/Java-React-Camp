package com.example.day5_homework.dataAccess.concretes;

import com.example.day5_homework.dataAccess.abstracts.UserDao;
import com.example.day5_homework.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    private List<User> userList = new ArrayList<>();

    @Override
    public void add(User user) {
        System.out.println("New user added to system: " + user.getFirstName());
        userList.add(user);
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() + "'s data updated.");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() + " deleted from system.");
    }

    @Override
    public List<User> getAll() {
        return userList;
    }
}
