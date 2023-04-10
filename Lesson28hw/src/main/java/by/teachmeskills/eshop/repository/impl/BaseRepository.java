package by.teachmeskills.eshop.repository.impl;

import by.teachmeskills.eshop.repository.utils.ConnectionPool;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class BaseRepository {

    @Resource
    protected ConnectionPool connectionPool;

}
