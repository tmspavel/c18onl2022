package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findAllByDate(LocalDateTime date);
}
