package com.tms2;

import lombok.Getter;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Getter
@Component
@Lazy
public class Dog implements Animal {

    private String name = "Dog";

    public Dog() {

        System.out.println("Dog initialized");
    }
}
