package by.teachmeskills.eshop.service.impl;

import by.teachmeskills.eshop.dao.domain.User;
import by.teachmeskills.eshop.dao.impl.UserDaoImpl;
import by.teachmeskills.eshop.exceptions.ServiceException;
import by.teachmeskills.eshop.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDaoImpl userDao = new UserDaoImpl();

    @Override
    public void create(User user) throws ServiceException {
        userDao.save(user);
    }

    @Override
    public User read(int id) throws ServiceException {
        return userDao.getById(id);
    }

    @Override
    public void update(User user) throws ServiceException {
//        userDao.update(user);
    }

    @Override
    public void delete(User user) throws ServiceException {
        userDao.removeUser(user);
    }

    @Override
    public User getUserByEmail(String email) throws ServiceException {
        return userDao.getUserByEmail(email);
    }

    @Override
    public List<User> findAllUsers() throws ServiceException {
        return userDao.getAllUsers();
    }

}
