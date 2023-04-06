package com.example.spring.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class User {

    @Autowired
    private String helloMessage;

    private String name;

    public void test() {
        System.out.println(helloMessage);
    }

}
