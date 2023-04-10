package com.tms2;

import lombok.Getter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Getter
@Primary
@Component
public class Cat implements Animal {

    private String name = "Cat";

}
