package by.teachmeskills.eshop.repository;

import by.teachmeskills.eshop.repository.utils.ConnectionPool;

public interface BaseRepository {

    ConnectionPool CONNECTION_POOL = ConnectionPool.getInstance();
}
