package com.example.spring.model;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Getter
@ToString
@Component
public class User {

    @Value("${hello.world}")
    private String name;

}
