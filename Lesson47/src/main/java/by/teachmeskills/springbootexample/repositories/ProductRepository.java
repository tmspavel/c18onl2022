package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>, SearchProductsRepository, JpaSpecificationExecutor<Product> {
    List<Product> findAllByCategoryId(int categoryId);
    Page<Product> findAllByCategoryId(int categoryId, Pageable pageable);
    Page<Product> findAllByCategoryIdAndNameContaining(int categoryId, String name, Pageable pageable);

    @Query("select p from Product p where p.price > :price")
    List<Product> findAllWithPriceGreaterThen(@Param("price") int price);

    @Query(value = "select * from eshop.products where price > :priceValue",
            nativeQuery = true)
    List<Product> findAllWithPriceGreaterThenNative(@Param("priceValue") int price);

    @Modifying
    @Query("update Product p set p.price = ?1 where p.id = ?2")
    int updateProductPrice(String price, String id);
}
