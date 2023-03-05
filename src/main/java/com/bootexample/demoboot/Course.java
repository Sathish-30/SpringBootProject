package com.bootexample.demoboot;

public class Course {
    private int id;
    private String courseName;
    private int duration;

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public Course(int id, String courseName, int duration){
        this.id=id;
        this.courseName=courseName;
        this.duration=duration;
    }
    public Course(){

    }
    @Override
    public String toString(){
        return "Course [id="+id+", Course_Name="+courseName+"]";
    }
}
