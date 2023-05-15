//package by.teachmeskills.springbootexample.repositories.impl;
//
//import by.teachmeskills.springbootexample.entities.User;
//import by.teachmeskills.springbootexample.repositories.UserRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Slf4j
//@Transactional
//@Repository
//public class UserRepositoryImpl implements UserRepository {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public User findById(int id) {
//        return entityManager.find(User.class, 1);
//    }
//
//    @Override
//    public List<User> findAll() {
//        return entityManager.createQuery("select u from User u ").getResultList();
//    }
//
//    @Override
//    public User findByEmailAndPassword(String email, String password) {
//        Query query = entityManager.createQuery("select u from User u where u.email=:email and u.password=:password");
//        query.setParameter("email", email);
//        query.setParameter("password", password);
//        return (User) query.getSingleResult();
//    }
//}
