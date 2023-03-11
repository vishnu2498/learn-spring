package com.learn.sping.learnspringboot.models;

import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public class Course {
    private int id;
    private String name;
    private String author;
}
