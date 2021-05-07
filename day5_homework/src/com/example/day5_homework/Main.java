package com.example.day5_homework;

import com.example.day5_homework.business.abstracts.UserService;
import com.example.day5_homework.business.concretes.EmailConfirmManager;
import com.example.day5_homework.business.concretes.UserManager;
import com.example.day5_homework.core.GoogleAuthManagerAdapter;
import com.example.day5_homework.dataAccess.abstracts.UserDao;
import com.example.day5_homework.dataAccess.concretes.HibernateUserDao;
import com.example.day5_homework.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        UserDao userDao = new HibernateUserDao();
        UserService userService = new UserManager(userDao, new EmailConfirmManager());
        UserService userFromExternalService = new UserManager(userDao, new GoogleAuthManagerAdapter());

        User baris = new User(0, "Baris", "Kilic", "bariskilic@mail.com", "abc123");
        User fakeUser = new User(0, "B", "K", "@mail.com", "123");

        System.out.println("1 ----------------------------------------------------");
        userService.addUser(baris);
        System.out.println("2 ----------------------------------------------------");
        userService.addUser(baris);
        System.out.println("3 ----------------------------------------------------");
        userService.addUser(fakeUser);
        System.out.println("4 ----------------------------------------------------");
        userFromExternalService.addUserFromExternalService("bariskilic@mail.com", "abc321");
        System.out.println("5 ----------------------------------------------------");
        userFromExternalService.addUserFromExternalService("abc999@gmail.com", "abc321");
        System.out.println("6 ----------------------------------------------------");
        System.out.println("All valid users in system: ");
        for(int i = 0; i< userDao.getAll().toArray().length; i++){
            System.out.println("  " + userDao.getAll().get(i).getFirstName() + " " + userDao.getAll().get(i).getLastName());
        }
        System.out.println("------------------------------------------------------");
    }
}
