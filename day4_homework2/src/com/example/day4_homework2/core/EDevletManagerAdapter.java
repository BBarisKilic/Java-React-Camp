package com.example.day4_homework2.core;

import com.example.day4_homework2.eDevlet.EDevletManager;
import com.example.day4_homework2.entities.concretes.User;

public class EDevletManagerAdapter implements CheckUserService{
    @Override
    public boolean checkIfUserReal(User user) {
        EDevletManager eDevletManager = new EDevletManager();
        return eDevletManager.checkIfPersonReal(user.getId(), user.getNationalId(), user.getFirstName(), user.getLastName(), user.getYearOfBirth());
    }
}
