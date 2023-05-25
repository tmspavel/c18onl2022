package by.teachmeskills.springbootexample.repositories.impl;

import by.teachmeskills.springbootexample.entities.OrderDetails;
import by.teachmeskills.springbootexample.repositories.OrderDetailsRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDetailsRepositoryImpl implements OrderDetailsRepository {
    private final SessionFactory sessionFactory;

    public OrderDetailsRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createOrderDetails(OrderDetails orderDetails) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(orderDetails);
        session.getTransaction().commit();
    }
}
