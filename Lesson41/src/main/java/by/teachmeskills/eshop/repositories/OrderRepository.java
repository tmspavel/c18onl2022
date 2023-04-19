package by.teachmeskills.eshop.repositories;

import by.teachmeskills.eshop.entities.Order;
import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends BaseRepository<Order> {

    Order findById(int id);

    List<Order> findByDate(LocalDateTime date);
}
