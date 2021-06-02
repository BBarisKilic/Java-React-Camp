package com.example.day5_homework.business.concretes;

import com.example.day5_homework.business.abstracts.ConfirmService;
import com.example.day5_homework.business.abstracts.UserService;
import com.example.day5_homework.core.ExternalUserService;
import com.example.day5_homework.dataAccess.abstracts.UserDao;
import com.example.day5_homework.entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    private final UserDao userDao;
    private final Pattern validEmailAddressRegex =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private ConfirmService confirmService;
    private ExternalUserService externalUserService;

    public UserManager(UserDao userDao, ConfirmService confirmService){
        this.userDao = userDao;
        this.confirmService = confirmService;
    }

    public UserManager(UserDao userDao, ExternalUserService externalUserService){
        this.userDao = userDao;
        this.externalUserService = externalUserService;
    }


    @Override
    public void addUser(User user) {
        boolean checkPoint1 = false, checkPoint2 = false, checkPoint3 = false, checkPoint4 = false, checkPoint5 = false;

        if(user.getPassword().length() < 6) {
            System.out.println("User password must contain at least 6 character.");
            checkPoint1 = true;
        }
        if(!validateEmail(user.getEmail())){
            System.out.println("User email is wrong: " + user.getEmail());
            checkPoint2 = true;
        }
        for(int i =0; i< userDao.getAll().toArray().length; i++){
            if(userDao.getAll().get(i).getEmail() == user.getEmail()){
                System.out.println("User email already in use: " + user.getEmail());
                checkPoint3 = true;
            }
        }
        if(user.getFirstName().length() < 2){
            System.out.println("User name must contain at least 2 character: " + user.getFirstName());
            checkPoint4 = true;
        }
        if(user.getLastName().length() < 2){
            System.out.println("User last name must contain at least 2 character: " + user.getLastName());
            checkPoint5 = true;
        }

        if(checkPoint1 || checkPoint2 || checkPoint3 || checkPoint4 || checkPoint5)
            return;
        confirmService.confirmUser(user);
        if(confirmService.isUserConfirmed(user)){
            userDao.add(user);
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

    @Override
    public void addUserFromExternalService(String email, String password) {
        User user = externalUserService.getUserInformation(email, password);
        boolean checkPoint1 = false;

        for(int i =0; i< userDao.getAll().toArray().length; i++){
            if(userDao.getAll().get(i).getEmail() == user.getEmail()){
                System.out.println("User email already in use: " + user.getEmail());
                checkPoint1 = true;
            }
        }
        if(checkPoint1)
            return;
        userDao.add(user);
    }

    private boolean validateEmail(String email) {
        Matcher matcher = validEmailAddressRegex.matcher(email);
        return matcher.find();
    }
}
