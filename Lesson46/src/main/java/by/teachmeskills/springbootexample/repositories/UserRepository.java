package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.User;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(int id);
    User findByEmailAndPassword(String email, String password);
    List<User> findAll();
}
