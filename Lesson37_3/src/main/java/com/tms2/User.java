package com.tms2;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class User {

    @Autowired
    private Animal object;

    @Autowired
    private Animal object2;

//    public User(@Qualifier("cat") Animal object, @Qualifier("dog") Animal object2) {
//        this.object = object;
//        this.object2 = object2;
//    }

    void info() {
        System.out.println(object.getName());
        System.out.println(object2.getName());
    }

}
