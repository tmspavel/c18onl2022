package com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Builder
@EqualsAndHashCode
public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private LocalDate birthday;
    private int balance;
    private List<Order> orders;
}
