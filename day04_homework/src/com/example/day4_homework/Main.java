package com.example.day4_homework;

import com.example.day4_homework.entities.Customer;
import com.example.day4_homework.managers.BaseCustomerManager;
import com.example.day4_homework.managers.CustomerCheckManager;
import com.example.day4_homework.managers.StarbucksCustomerManager;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager.Save(new Customer(0, "Baris", "Kilic", "1995" , "22222222222"));
    }
}
