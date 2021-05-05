package com.example.day4_homework.managers;

import com.example.day4_homework.entities.Customer;
import com.example.day4_homework.interfaces.CustomerService;

public class BaseCustomerManager implements CustomerService {
    @Override
    public void Save(Customer customer) {
        System.out.println("Saved to db: "+ customer.getFirstName());
    }
}
