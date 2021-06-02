package com.example.day3_homework;

public class Course {
    int id;
    String courseImagePath;
    String courseName;
    String teacher;
    int progress;

    public Course(){}

    public Course(int id, String courseImagePath, String courseName, String teacher, int progress){
        this.id = id;
        this.courseImagePath = courseImagePath;
        this.courseName = courseName;
        this.teacher = teacher;
        this.progress = progress;
    }
}
