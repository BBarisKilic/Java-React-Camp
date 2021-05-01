package com.example.day3_homework;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User{
    private List<Course> myCourses = new ArrayList<Course>();
    private String resume;

    public List<Course> getMyCourses() {
        return myCourses;
    }

    public void addToMyCourses(Course myCourse) {
        this.myCourses.add(myCourse);
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public void create() {
        super.create();
        System.out.println("Instructor account created.");
    }
}
