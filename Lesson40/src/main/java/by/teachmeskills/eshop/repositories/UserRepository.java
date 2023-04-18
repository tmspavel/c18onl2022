package by.teachmeskills.eshop.repositories;

import by.teachmeskills.eshop.entities.User;

public interface UserRepository extends BaseRepository<User> {

    User findById(int id);

    User findByEmailAndPassword(String email, String password);
}
