package com.example.spring.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpringHelloWorldTest {

    @Test
    void displayHelloWorld() {
        SpringHelloWorld springHelloWorld = new SpringHelloWorld("hello", "123");
        String result = springHelloWorld.displayHelloWorld();

        System.out.println(springHelloWorld.getHelloWorld());
//        assertNull(result);
        Assertions.assertEquals("hello", result);
    }
}
