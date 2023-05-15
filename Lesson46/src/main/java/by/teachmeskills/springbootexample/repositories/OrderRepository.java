package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.Order;

import by.teachmeskills.springbootexample.entities.User;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
    Order findById(int id);

    List<Order> findByDate(LocalDateTime date);
}
