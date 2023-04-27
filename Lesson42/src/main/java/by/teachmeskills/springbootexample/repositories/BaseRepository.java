package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.BaseEntity;
import java.util.List;

public interface BaseRepository<T extends BaseEntity> {

    T create(T entity);

    List<T> read();

    T update(T entity);

    void delete(int id);
}
