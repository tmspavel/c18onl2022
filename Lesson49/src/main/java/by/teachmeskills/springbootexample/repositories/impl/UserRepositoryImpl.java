package by.teachmeskills.springbootexample.repositories.impl;

import by.teachmeskills.springbootexample.entities.User;
import by.teachmeskills.springbootexample.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class UserRepositoryImpl implements UserRepository {
    private final SessionFactory sessionFactory;

    public UserRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select u from User u ").list();
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        Session session = sessionFactory.getCurrentSession();
        Query<User> query = session.createQuery("select u from User u where u.email=:email and u.password=:password");
        query.setParameter("email", email);
        query.setParameter("password", password);
        return query.uniqueResult();
    }
}
