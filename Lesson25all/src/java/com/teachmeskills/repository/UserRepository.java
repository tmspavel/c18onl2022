package com.teachmeskills.repository;

import com.teachmeskills.model.User;
import java.util.List;

public interface UserRepository {

  List<User> findUsers();

}
