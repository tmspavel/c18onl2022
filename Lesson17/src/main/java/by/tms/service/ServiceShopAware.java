package by.tms.service;

import by.tms.model.Product;

import java.util.List;

public interface ServiceShopAware {
    boolean add(Product product);

    boolean delete(Product product);

    void edit(long id, Product product);

    List<Product> getProducts();
}
