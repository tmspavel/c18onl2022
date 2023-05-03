package by.teachmeskills.eshop.service;

import by.teachmeskills.eshop.dao.domain.BaseEntity;
import by.teachmeskills.eshop.dao.domain.User;
import by.teachmeskills.eshop.exceptions.ServiceException;

public interface BaseService<T extends BaseEntity> {

    void create(T entity) throws ServiceException;

    T read(int id) throws ServiceException;

    void update(T entity) throws ServiceException;

    void delete(User user) throws ServiceException;

}
