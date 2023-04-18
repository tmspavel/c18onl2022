package by.teachmeskills.eshop.repositories.impl;

import by.teachmeskills.eshop.entities.Category;
import by.teachmeskills.eshop.repositories.CategoryRepository;
import by.teachmeskills.eshop.repositories.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final ConnectionPool connectionPool;
    private static String GET_ALL_CATEGORIES = "SELECT * FROM categories";
    private static String GET_CATEGORY_BY_ID = "SELECT * FROM categories WHERE id = ?";

    public CategoryRepositoryImpl(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    @Override
    public Category create(Category entity) {
        return null;
    }

    @Override
    public List<Category> read() {
        List<Category> categories = new ArrayList<>();

        try (Connection connection = connectionPool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_CATEGORIES);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String imagePath = rs.getString("image_path");
                int rating = rs.getInt("rating");

                categories.add(Category.builder()
                                       .id(id)
                                       .name(name)
                                       .imagePath(imagePath)
                                       .rating(rating)
                                       .build());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return categories;
    }

    @Override
    public Category update(Category entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Category findById(int id) {
        Category category = null;
        try (Connection connection = connectionPool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_CATEGORY_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                category = Category.builder()
                                   .id(rs.getInt("id"))
                                   .name(rs.getString("name"))
                                   .imagePath(rs.getString("image_path"))
                                   .rating(rs.getInt("rating"))
                                   .build();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return category;
    }
}
