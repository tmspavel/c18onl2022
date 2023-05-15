//package by.teachmeskills.springbootexample.repositories.impl;
//
//import by.teachmeskills.springbootexample.entities.Category;
//import by.teachmeskills.springbootexample.repositories.CategoryRepository;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Transactional
//@Repository
//public class CategoryRepositoryImpl implements CategoryRepository {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public Category findById(int id) {
//        return entityManager.find(Category.class, id);
//    }
//
//    @Override
//    public List<Category> findAllCategories() {
//        return entityManager.createQuery("select c from Category c").getResultList();
//    }
//}
