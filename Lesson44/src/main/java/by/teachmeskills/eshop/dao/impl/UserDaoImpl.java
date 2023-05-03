package by.teachmeskills.eshop.dao.impl;import by.teachmeskills.eshop.config.HibernateConfig;
import by.teachmeskills.eshop.dao.UserDao;
import by.teachmeskills.eshop.dao.domain.User;
import by.teachmeskills.eshop.exceptions.DAOException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public User getUserByEmail(String email) throws DAOException {
        User users;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Query<User> query = session.createQuery("select u from User u where u.email =: email");
            query.setParameter("email", email);

            users = query.uniqueResult();
        }
        return users;
    }

    public void save(User user) {
        Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            session.clear();

            session.update(user);

//            Session session1 = HibernateConfig.getSessionFactory().openSession();
            User user1 = session.get(User.class, 1);
            String name = user1.getName();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.out.println(e.getMessage());
        }
    }

    public void removeUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.out.println(e.getMessage());
        }
    }

    @Override
    public User getById(int id){
        Transaction transaction;
        User user = null;
        User convertUser = new User();

        try (Session session = HibernateConfig.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            user = session.load(User.class, id);//Wrapper under User class
            convertUser.setName(user.getName());
            transaction.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return convertUser;
    }

    @Override
    public List<User> getAllUsers() throws DAOException {
        List<User> users;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            users = session.createQuery("select u from User u", User.class).getResultList();
        }
        return users;
    }

    public List<User> findAllUsersWithCriteriaQuery() throws DAOException {
        List<User> users;

        try (Session session = HibernateConfig.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cq = cb.createQuery(User.class);
            Root<User> rootEntry = cq.from(User.class);
            cq.select(rootEntry);

            TypedQuery<User> allQuery = session.createQuery(cq);
            users = allQuery.getResultList();
        }

        return users;
    }
}

