package by.teachmeskills.springbootexample.repositories.impl;

import by.teachmeskills.springbootexample.entities.User;
import by.teachmeskills.springbootexample.repositories.UserRepository;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbc;
    private static String GET_ALL_USERS = "SELECT * FROM users";
    private static String GET_USER_BY_EMAIL_AND_PASS = "SELECT * FROM users WHERE email = ? AND password = ?";

    public UserRepositoryImpl(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public User create(User entity) {
        return null;
    }

    @Override
    public List<User> read() {
        return jdbc.query(GET_ALL_USERS, (rs, rowNum) -> User.builder()
                                                             .id(rs.getInt("id"))
                                                             .name(rs.getString("name"))
                                                             .surname(rs.getString("surname"))
                                                             .email(rs.getString("email"))
                                                             .password(rs.getString("password"))
                                                             .birthday(rs.getDate("birthday"))
                                                             .balance(rs.getInt("balance"))
                                                             .build()
        );
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        return jdbc.queryForObject(GET_USER_BY_EMAIL_AND_PASS, (RowMapper<User>) (rs, rowNum) -> User.builder()
                                                                                                     .id(rs.getInt("id"))
                                                                                                     .name(rs.getString("name"))
                                                                                                     .surname(rs.getString("surname"))
                                                                                                     .email(rs.getString("email"))
                                                                                                     .password(rs.getString("password"))
                                                                                                     .birthday(rs.getDate("birthday"))
                                                                                                     .balance(rs.getInt("balance"))
                                                                                                     .build(), email, password);
    }
}
