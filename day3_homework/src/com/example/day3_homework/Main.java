package com.example.day3_homework;

public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Instructor enginDemirog = new Instructor();
        Student barisKilic = new Student();

        userManager.save(enginDemirog);
        userManager.save(barisKilic);
    }
}
