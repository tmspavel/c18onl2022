package com.teachmeskills.repository;

import com.teachmeskills.model.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcUserRepository implements UserRepository {

    private final Connection connection;

    public JdbcUserRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<User> findUsers() {
        System.out.println("5");
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String sql = "select name from users";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                final User user = new User(rs.getString("name"));
                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
}
