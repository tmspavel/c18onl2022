package com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.service;

import com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.model.Order;
import com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrdersForUser(){
        return orderRepository.getOrders();
    }
}
