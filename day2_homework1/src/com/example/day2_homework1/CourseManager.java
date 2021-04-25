package com.example.day2_homework1;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    List<Course> courses = new ArrayList<Course>();

    public void addCourse(Course course){
        courses.add(course);
    }

    public void deleteCourse(int index){
        courses.remove(index);
    }
}
