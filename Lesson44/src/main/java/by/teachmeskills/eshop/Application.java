package by.teachmeskills.eshop;

import by.teachmeskills.eshop.config.HibernateConfig;
import by.teachmeskills.eshop.dao.UserDao;
import by.teachmeskills.eshop.dao.domain.User;
import by.teachmeskills.eshop.dao.impl.UserDaoImpl;
import by.teachmeskills.eshop.exceptions.DAOException;
import org.hibernate.Session;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) throws DAOException {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.getById(1));
//        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
//            session.beginTransaction();
//            User user = User.builder()
//                            .name("SomeUser1")
//                            .surname("SomeUser1")
//                            .email("user1@mail.ru")
//                            .password("dddddd")
//                            .dateOfBirthday(LocalDateTime.now().minusYears(20))
//                            .balance(1000).build();
//
//            session.save(user);
//        }
    }
}


