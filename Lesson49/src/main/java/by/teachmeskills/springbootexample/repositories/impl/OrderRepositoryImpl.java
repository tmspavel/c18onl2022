package by.teachmeskills.springbootexample.repositories.impl;

import by.teachmeskills.springbootexample.entities.Order;
import by.teachmeskills.springbootexample.repositories.OrderRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    private final SessionFactory sessionFactory;


    public OrderRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void createOrder(Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(order);
        session.getTransaction().commit();
    }

    @Override
    public Order findById(int id) {
        return null;
    }

    @Override
    public List<Order> findByDate(LocalDateTime date) {
        return null;
    }
}
