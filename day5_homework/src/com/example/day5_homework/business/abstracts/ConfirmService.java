package com.example.day5_homework.business.abstracts;

import com.example.day5_homework.entities.concretes.User;

public interface ConfirmService {
    void confirmUser(User user);
    boolean isUserConfirmed(User user);
}
