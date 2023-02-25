package by.teachmeskills.eshop.listener;

import by.teachmeskills.eshop.repository.CategoryRepositoryImpl;
import by.teachmeskills.eshop.repository.ProductRepositoryImpl;
import by.teachmeskills.eshop.service.CategoryService;
import by.teachmeskills.eshop.service.ProductService;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        ProductService productService = new ProductService(new ProductRepositoryImpl());
        sce.getServletContext().setAttribute("productService", productService);
        CategoryService categoryService = new CategoryService(new CategoryRepositoryImpl());
        sce.getServletContext().setAttribute("categoryService", categoryService);
    }
}
