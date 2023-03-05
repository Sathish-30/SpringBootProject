package com.bootexample.demoboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseDetail detail;
    @GetMapping("/courses")
    public List<Course> retrieveAllCourse(){
        return detail.getArr();
    }
    @GetMapping("/duration")
    public List<String> retrieveMoneyLessCourse(){
        return detail.getMoneyCourse();
    }
    @GetMapping("/")
    public String homePage(){
       return "Home Page" ;
    }
}
