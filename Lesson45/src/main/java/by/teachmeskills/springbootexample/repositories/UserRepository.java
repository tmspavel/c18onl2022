package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.User;

import java.util.List;

public interface UserRepository {
    User findById(int id);
    User findByEmailAndPassword(String email, String password);
    List<User> findAll();
}
