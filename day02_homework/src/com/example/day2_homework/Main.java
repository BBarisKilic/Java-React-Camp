package com.example.day2_homework;

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course(
                0,
                "firstImagePath",
                "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
                "Engin Demirog",
                2);
        Course course2 = new Course(
                1,
                "secondImagePath",
                "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
                "Engin Demirog",
                36);


        CourseManager courseManager = new CourseManager();

        courseManager.addCourse(course1);
        courseManager.addCourse(course2);

        for(Course currentCourse : courseManager.courses){
            System.out.println("== == == == ==");
            System.out.println(currentCourse.courseImagePath);
            System.out.println(currentCourse.courseName);
            System.out.println(currentCourse.teacher);
            System.out.println(currentCourse.progress);
            System.out.println("== == == == ==");
        }

        courseManager.deleteCourse(1);

        for(Course currentCourse : courseManager.courses){
            System.out.println("== == == == ==");
            System.out.println(currentCourse.courseImagePath);
            System.out.println(currentCourse.courseName);
            System.out.println(currentCourse.teacher);
            System.out.println(currentCourse.progress);
            System.out.println("== == == == ==");
        }
    }
}
