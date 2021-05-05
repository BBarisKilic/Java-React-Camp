package com.example.day4_homework.managers;

import com.example.day4_homework.interfaces.CheckPersonService;
import com.example.day4_homework.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CheckPersonService checkPersonService;

    public StarbucksCustomerManager(CheckPersonService checkPersonService){
        this.checkPersonService = checkPersonService;
    }

    @Override
    public void Save(Customer customer) {
        if(checkPersonService.checkIfRealPerson(customer))
            super.Save(customer);
        else
           System.out.println("Not a real person");
    }
}
