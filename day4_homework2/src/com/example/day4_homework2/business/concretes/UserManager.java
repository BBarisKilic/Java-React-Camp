package com.example.day4_homework2.business.concretes;

import com.example.day4_homework2.business.abstracts.UserService;
import com.example.day4_homework2.core.CheckUserService;
import com.example.day4_homework2.dataAccess.abstracts.UserDao;
import com.example.day4_homework2.entities.concretes.User;

public class UserManager implements UserService {
    CheckUserService checkUserService;
    UserDao userDao;

    public UserManager(CheckUserService checkUserService, UserDao userDao){
        this.checkUserService = checkUserService;
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        if(checkUserService.checkIfUserReal(user)){
            userDao.add(user);
        }
        else{
            System.out.println("User does not exist.");
        }
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user);
    }
}
