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
public class Order {
    private int price;
    private LocalDate date;
    private int userId;
    private List<Product> products;
}
