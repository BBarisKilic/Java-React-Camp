package com.example.day2_homework;

public class Course {

    public Course(int id, String courseImagePath, String courseName, String teacher, int progress){
        this.id = id;
        this.courseImagePath = courseImagePath;
        this.courseName = courseName;
        this.teacher = teacher;
        this.progress = progress;
    }

    int id;
    String courseImagePath;
    String courseName;
    String teacher;
    int progress;
}
