package by.teachmeskills.eshop.service;

import by.teachmeskills.eshop.dao.domain.User;
import by.teachmeskills.eshop.exceptions.ServiceException;

import java.util.List;

public interface UserService extends BaseService<User> {

    User getUserByEmail(String email) throws ServiceException;

    List<User> findAllUsers() throws ServiceException;
}
