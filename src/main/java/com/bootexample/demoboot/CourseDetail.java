package com.bootexample.demoboot;

//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CourseDetail {
    List<Course> arr = new ArrayList<>(Arrays.asList(
            new Course(1,"Java",45),
            new Course(2,"C++",60),
            new Course(3,"Dyanmic Programming",150),
            new Course(4,"Python for Data Science",90),
            new Course(5,"Cloud",120),
            new Course(6,"Azure",240),
            new Course(7,"Aws",240),
            new Course(8,"Google Cloud",220)
    ));
    public List<Course> getArr(){
        return arr;
    }

    public List<String> getMoneyCourse() {
        List<Course> val = new ArrayList<>();
        List<String> out = new ArrayList<>();
        val=arr.stream().filter(i->i.getDuration()<=90).collect(Collectors.toList());
        val.forEach(i->out.add(i.getCourseName()));
        return out;
    }
}
