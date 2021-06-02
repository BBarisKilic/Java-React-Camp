package com.example.day4_homework.adapters;

import com.example.day4_homework.interfaces.CheckPersonService;
import com.example.day4_homework.entities.Customer;

public class MernisServiceAdapter implements CheckPersonService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
    }
}
