package com.example.day3_homework;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    private List<Course> enrolledCourses = new ArrayList<Course>();
    private String creditCardInformation;

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void addToEnrolledCourses(Course enrolledCourse) {
        this.enrolledCourses.add(enrolledCourse);
    }

    public String getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(String creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }

    @Override
    public void create() {
        super.create();
        System.out.println("Student account created.");
    }
}
