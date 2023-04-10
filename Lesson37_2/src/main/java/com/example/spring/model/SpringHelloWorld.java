package com.example.spring.model;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public class SpringHelloWorld {
    //констурктора !!! самый лучший сбособ

    private final String message;

    private final String test;

    @Value("${hello.world}")
    private String helloWorld;


    public SpringHelloWorld(String message, String test) {
        this.message = message;
        this.test = test;
    }

    String displayHelloWorld() {
        return message;
    }

    public String getHelloMessage() {
        return message;
    }

    public String getTest() {
        return test;
    }
}
