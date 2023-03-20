package by.teachmeskills.eshop.listener;

import by.teachmeskills.eshop.model.Command;
import by.teachmeskills.eshop.repository.utils.ConnectionPool;
import by.teachmeskills.eshop.utils.CommandControllerFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    @SneakyThrows
    public void contextInitialized(ServletContextEvent sce) {
        log.info("InitializationContextListener start");
        for (Command command : Command.values()) {
            CommandControllerFactory.defineCommand(command);
        }
        //TODO: for example
//        CategoryRepository jdbcCategoryRepository = new JdbcCategoryRepositoryImpl(getConnection(sce));
//        CategoryService categoryService = new CategoryService(jdbcCategoryRepository);
//        sce.getServletContext().setAttribute("categoryService", categoryService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("InitializationContextListener Destroyed");
        ConnectionPool.getInstance().closeAllConnection();
    }

    private Connection getConnection(ServletContextEvent sce) {
        String username = sce.getServletContext().getInitParameter("db_user");
        String password = sce.getServletContext().getInitParameter("db_password");
        String dbUrl = sce.getServletContext().getInitParameter("db_url");
        String dbDriver = sce.getServletContext().getInitParameter("db_driver");
        try {
            Class.forName(dbDriver);
            return DriverManager.getConnection(dbUrl, username, password);
        } catch (Exception e) {
            System.out.println("Unexpected error " + e.getMessage());
        }
        return null;
    }
}
