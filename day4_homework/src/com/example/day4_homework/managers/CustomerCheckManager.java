package com.example.day4_homework.managers;

import com.example.day4_homework.interfaces.CheckPersonService;
import com.example.day4_homework.entities.Customer;

public class CustomerCheckManager implements CheckPersonService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
    }
}
