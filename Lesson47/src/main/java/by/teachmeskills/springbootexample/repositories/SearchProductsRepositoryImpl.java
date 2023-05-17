package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SearchProductsRepositoryImpl implements SearchProductsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findProductsListByParams(Map<String, String> searchParams) {
        List<Product> foundProducts = new ArrayList<>();
        if (searchParams.size() == 1) {
            if (searchParams.containsKey("name")) {
                TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product p WHERE p.name=:name", Product.class);
                foundProducts = query.setParameter("name", searchParams.get("name")).getResultList();
            } else if (searchParams.containsKey("price")) {
                TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product p WHERE p.price=:price", Product.class);
                foundProducts = query.setParameter("price", searchParams.get("price")).getResultList();
            } else if (searchParams.containsKey("description")) {
                TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product p WHERE p.description=:description", Product.class);
                foundProducts = query.setParameter("description", searchParams.get("description")).getResultList();
            }
        }
        return foundProducts;
    }
}
