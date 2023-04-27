package by.teachmeskills.springbootexample.repositories.impl;

import by.teachmeskills.springbootexample.entities.Category;
import by.teachmeskills.springbootexample.repositories.CategoryRepository;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final JdbcTemplate jdbcTemplate;
    private static String GET_ALL_CATEGORIES = "SELECT * FROM categories";
    private static String GET_CATEGORY_BY_ID = "SELECT * FROM categories WHERE id = ?";

    public CategoryRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Category create(Category entity) {
        return null;
    }

    @Override
    public List<Category> read() {
        return jdbcTemplate.query(GET_ALL_CATEGORIES, (rs, rowNum) -> Category.builder()
                                                                              .id(rs.getInt("id"))
                                                                              .name(rs.getString("name"))
                                                                              .imagePath(rs.getString("image_path"))
                                                                              .rating(rs.getInt("rating"))
                                                                              .build()
        );
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
        return jdbcTemplate.queryForObject(GET_CATEGORY_BY_ID, (RowMapper<Category>) (rs, rowNum) -> Category.builder()
                                                                                                             .id(rs.getInt("id"))
                                                                                                             .name(rs.getString("name"))
                                                                                                             .imagePath(rs.getString("image_path"))
                                                                                                             .rating(rs.getInt("rating"))
                                                                                                             .build(), id);
    }
}
