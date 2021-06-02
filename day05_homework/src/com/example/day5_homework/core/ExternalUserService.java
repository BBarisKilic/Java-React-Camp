package com.example.day5_homework.core;

import com.example.day5_homework.entities.concretes.User;

public interface ExternalUserService {
    User getUserInformation(String email, String password);
}
