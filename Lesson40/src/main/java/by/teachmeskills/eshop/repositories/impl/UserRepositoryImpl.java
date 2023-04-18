package by.teachmeskills.eshop.repositories.impl;

import by.teachmeskills.eshop.entities.User;
import by.teachmeskills.eshop.repositories.ConnectionPool;
import by.teachmeskills.eshop.repositories.UserRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final ConnectionPool connectionPool;
    private static String GET_ALL_USERS = "SELECT * FROM users";
    private static String GET_USER_BY_EMAIL_AND_PASS = "SELECT * FROM users WHERE email = ? AND password = ?";

    public UserRepositoryImpl(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    @Override
    public User create(User entity) {
        return null;
    }

    @Override
    public List<User> read() {
        List<User> users = new ArrayList<>();

        try (Connection connection = connectionPool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_USERS);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Date birthday = rs.getDate("birthday");
                int balance = rs.getInt("balance");

                users.add(User.builder()
                              .id(id)
                              .name(name)
                              .surname(surname)
                              .email(email)
                              .password(password)
                              .birthday(birthday)
                              .balance(balance)
                              .build());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return users;
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
        User user = null;

        try (Connection connection = connectionPool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_BY_EMAIL_AND_PASS);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                user = User.builder()
                           .id(rs.getInt("id"))
                           .name(rs.getString("name"))
                           .surname(rs.getString("surname"))
                           .email(rs.getString("email"))
                           .password(rs.getString("password"))
                           .birthday(rs.getDate("birthday"))
                           .balance(rs.getInt("balance"))
                           .build();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return user;
    }
}
