package com.example.day4_interfaces;

public class EmailLogger implements Logger{
    @Override
    public void log(String message) {

        System.out.println("Email loglandı: " + message);
    }
}
