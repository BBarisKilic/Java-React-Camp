package com.example.day5_homework.business.concretes;

import com.example.day5_homework.business.abstracts.ConfirmService;
import com.example.day5_homework.entities.concretes.User;

public class EmailConfirmManager implements ConfirmService {
    @Override
    public void confirmUser(User user) {
        System.out.println("A confirmation email has been sent to " + user.getEmail());
    }

    @Override
    public boolean isUserConfirmed(User user) {
        System.out.println(user.getFirstName() + "'s email address confirmed.");
        return true;
    }
}
