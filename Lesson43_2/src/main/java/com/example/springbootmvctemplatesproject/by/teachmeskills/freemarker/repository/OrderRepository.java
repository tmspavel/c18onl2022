package com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.repository;

import com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.model.Order;
import com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.model.Product;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class OrderRepository {

    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        orders.add(Order.builder()
                .price(100)
                .date(LocalDate.now())
                .userId(1)
                .products(Arrays.asList(
                        Product.builder()
                                .price(50)
                                .categoryId(1)
                                .description("Some description")
                                .imagePath("/images")
                                .name("Samsung Galaxy S8+")
                                .build(),
                        Product.builder()
                                .price(50)
                                .categoryId(2)
                                .description("Some other description")
                                .imagePath("/images")
                                .name("Mac Book Pro")
                                .build()))
                .build());
        orders.add(Order.builder()
                .price(1000)
                .date(LocalDate.now().minusDays(1))
                .userId(2)
                .products(Arrays.asList(
                        Product.builder()
                                .price(500)
                                .categoryId(1)
                                .description("Fridge description")
                                .imagePath("/images")
                                .name("Atlant")
                                .build(),
                        Product.builder()
                                .price(500)
                                .categoryId(2)
                                .description("GPS description")
                                .imagePath("/images")
                                .name("Garmina")
                                .build()))
                .build());

        return orders;
    }
}
