package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.Order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository {
    void createOrder(Order order);
    Order findById(int id);

    List<Order> findByDate(LocalDateTime date);
}
