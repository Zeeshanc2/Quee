package com.example.quee;

public class Courses {
    private String courseName="";
    private int courseImage = 0;

    Courses(){

    }

    public Courses(String courseName, int courseImage) {
        this.courseName = courseName;
        this.courseImage = courseImage;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseImage() {
        return courseImage;
    }

}
