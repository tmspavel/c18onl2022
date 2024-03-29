package by.teachmeskills.eshop.repository.impl;

import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.repository.CategoryRepository;
import by.teachmeskills.eshop.repository.utils.ConnectionWrapper;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcCategoryRepositoryImpl extends BaseRepository implements CategoryRepository {

    private static final String SELECT_FROM_CATEGORIES = "select * from categories";

    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = connectionPool.getConnectionWrapper();
                Statement statement = connectionWrapper.getConnection().createStatement()) {

            try (ResultSet rs = statement.executeQuery(SELECT_FROM_CATEGORIES)) {
                while (rs.next()) {
                    Category category = Category.builder()
                                                .id(rs.getInt("id"))
                                                .name(rs.getString("name"))
                                                .imageName(rs.getString("imageName"))
                                                .build();
                    categories.add(category);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return categories;
    }

    @Override
    public Category getCategory(int id) {
        return null;
    }
}
