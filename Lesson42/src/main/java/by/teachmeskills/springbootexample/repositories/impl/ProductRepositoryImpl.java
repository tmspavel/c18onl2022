package by.teachmeskills.springbootexample.repositories.impl;

import by.teachmeskills.springbootexample.entities.Product;
import by.teachmeskills.springbootexample.repositories.ProductRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private static String GET_ALL_PRODUCTS_BY_CATEGORY_ID = "SELECT * FROM products WHERE category_id = ?";
    private static String GET_PRODUCT_BY_ID = "SELECT * FROM products WHERE id = ?";

    private final JdbcTemplate jdbcTemplate;

    public ProductRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
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
        log.info(String.format("Method UserServiceImpl#findById(%s) is called", id));

        return jdbcTemplate.queryForObject(GET_PRODUCT_BY_ID, (RowMapper<Product>) (rs, rowNum) -> Product.builder()
                                                                                                          .id(rs.getInt("id"))
                                                                                                          .name(rs.getString("name"))
                                                                                                          .description(rs.getString("description"))
                                                                                                          .price(rs.getInt("price"))
                                                                                                          .imagePath(rs.getString("image_path"))
                                                                                                          .categoryId(rs.getInt("category_id"))
                                                                                                          .build(), id);
    }

    @Override
    public List<Product> findAllByCategoryId(int categoryId) {
        return jdbcTemplate.query(GET_ALL_PRODUCTS_BY_CATEGORY_ID, (rs, rowNum) -> Product.builder()
                                                                                          .id(rs.getInt("id"))
                                                                                          .name(rs.getString("name"))
                                                                                          .description(rs.getString("description"))
                                                                                          .price(rs.getInt("price"))
                                                                                          .imagePath(rs.getString("image_path"))
                                                                                          .categoryId(rs.getInt("category_id"))
                                                                                          .build(), categoryId);
    }
}
