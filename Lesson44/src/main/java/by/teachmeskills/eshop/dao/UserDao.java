package by.teachmeskills.eshop.dao;

import by.teachmeskills.eshop.dao.domain.User;
import by.teachmeskills.eshop.exceptions.DAOException;

import java.util.List;

public interface UserDao {

    User getUserByEmail(String email) throws DAOException;

    List<User> getAllUsers() throws DAOException;

    User getById(int id);

    void removeUser(User user);

    List<User> findAllUsersWithCriteriaQuery() throws DAOException;
}
