package com.example.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringHelloWorld {

    @Autowired
    private String message;

    @Autowired
    private String test;

    public String getHelloMessage() {
        return message;
    }

    public String getTest() {
        return test;
    }
}
