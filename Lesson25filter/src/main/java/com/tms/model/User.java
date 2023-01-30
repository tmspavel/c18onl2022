package com.tms.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class User {

    private String email;
    private String password;

    {
        email = "test@gmail.com";
        password = "12345";
    }

}
