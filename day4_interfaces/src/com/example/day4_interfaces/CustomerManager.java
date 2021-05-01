package com.example.day4_interfaces;

public class CustomerManager {

    private Logger[] loggers;

    CustomerManager(Logger[] loggers){
        this.loggers = loggers;
    }

    //loosely - tightly coupled
    public void add(Customer customer){
        System.out.println("Müşteri eklendi: " + customer.getFirstName());

        for(Logger logger : loggers){
            logger.log(customer.getFirstName());
        }
    }

    public void delete(Customer customer){
        System.out.println("Müşteri silindi: " + customer.getFirstName());

        for(Logger logger : loggers){
            logger.log(customer.getFirstName());
        }
    }
}
