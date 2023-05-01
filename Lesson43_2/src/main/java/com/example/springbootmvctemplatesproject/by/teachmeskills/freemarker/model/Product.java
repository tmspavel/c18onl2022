package com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class Product {
    private String name;
    private String description;
    private int price;
    private int categoryId;
    private String imagePath;
}
