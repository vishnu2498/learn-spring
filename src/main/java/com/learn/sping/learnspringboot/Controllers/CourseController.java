package com.learn.sping.learnspringboot.Controllers;

import com.learn.sping.learnspringboot.models.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {

    @GetMapping("/courses")
    public List<Course> retrieveAllCourses()
    {
        return Arrays.asList(new Course(1, "Harry Potter", "JK Rowling"),
                new Course(2, "God delusion", "Richard Dawkins"),
                new Course(3, "Learn Azure", "Azure"));
    }
}
