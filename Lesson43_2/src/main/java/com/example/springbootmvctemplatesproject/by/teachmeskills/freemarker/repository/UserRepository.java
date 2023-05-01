package com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.repository;

import com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.model.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;

@Repository
public class UserRepository {
    public User getUser(){
        return User.builder()
                .name("Ivan")
                .surname("Ivanov")
                .email("ivan.ivanov@mail.ru")
                .password("12345_qwerty")
                .birthday(LocalDate.now())
                .balance(1000)
                .build();
    }
}
