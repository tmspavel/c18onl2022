//package by.teachmeskills.springbootexample.repositories.impl;
//
//import by.teachmeskills.springbootexample.entities.Product;
//import by.teachmeskills.springbootexample.repositories.ProductRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Slf4j
//@Transactional
//@Repository
//public class ProductRepositoryImpl implements ProductRepository {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public Product findById(int id) {
//        log.info(String.format("Method UserServiceImpl#findById(%s) is called", id));
//        return entityManager.find(Product.class, id);
//    }
//
//    @Override
//    public List<Product> findAllByCategoryId(int categoryId) {
//        Query query = entityManager.createQuery("select p from Product p where p.category.id=:categoryId");
//        query.setParameter("categoryId", categoryId);
//        return query.getResultList();
//    }
//}
