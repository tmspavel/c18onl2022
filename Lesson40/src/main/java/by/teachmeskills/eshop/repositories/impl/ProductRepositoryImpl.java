package by.teachmeskills.eshop.repositories.impl;

import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.repositories.ConnectionPool;
import by.teachmeskills.eshop.repositories.ProductRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private static String GET_ALL_PRODUCTS_BY_CATEGORY_ID = "SELECT * FROM products WHERE category_id = ?";
    private static String GET_PRODUCT_BY_ID = "SELECT * FROM products WHERE id = ?";

    private final ConnectionPool connectionPool;

    public ProductRepositoryImpl(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    @Override
    public Product create(Product entity) {
        return null;
    }

    @Override
    public List<Product> read() {
        return null;
    }

    @Override
    public Product update(Product entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product findById(int id) {
        Product product = null;
        try (Connection connection = connectionPool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_PRODUCT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                product = Product.builder()
                                 .id(rs.getInt("id"))
                                 .name(rs.getString("name"))
                                 .description(rs.getString("description"))
                                 .price(rs.getInt("price"))
                                 .imagePath(rs.getString("image_path"))
                                 .categoryId(rs.getInt("category_id"))
                                 .build();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public List<Product> findByAllCategoryId(int categoryId) {
        List<Product> products = new ArrayList<>();

        try (Connection connection = connectionPool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_PRODUCTS_BY_CATEGORY_ID);
            preparedStatement.setInt(1, categoryId);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                String imagePath = rs.getString("image_path");
                int catId = rs.getInt("category_id");

                products.add(Product.builder()
                                    .id(id)
                                    .name(name)
                                    .description(description)
                                    .price(price)
                                    .imagePath(imagePath)
                                    .categoryId(catId)
                                    .build());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return products;
    }
}
