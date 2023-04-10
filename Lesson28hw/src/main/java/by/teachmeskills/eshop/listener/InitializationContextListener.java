package by.teachmeskills.eshop.listener;

import by.teachmeskills.eshop.config.BeanConfig;
import by.teachmeskills.eshop.repository.utils.ConnectionPool;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    @SneakyThrows
    public void contextInitialized(ServletContextEvent sce) {
        log.info("InitializationContextListener start");
//        for (Command command : Command.values()) {
//            CommandControllerFactory.defineCommand(command);
//        }
        //логика
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        sce.getServletContext().setAttribute("appContext", ctx);
        //TODO: for example
//        CategoryRepository jdbcCategoryRepository = new JdbcCategoryRepositoryImpl(getConnection(sce));
//        CategoryService categoryService = new CategoryService(jdbcCategoryRepository);
//        sce.getServletContext().setAttribute("categoryService", categoryService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("InitializationContextListener Destroyed");
        AnnotationConfigApplicationContext appContext = (AnnotationConfigApplicationContext) sce.getServletContext().getAttribute("appContext");
        ConnectionPool connectionPool = appContext.getBean(ConnectionPool.class);
        connectionPool.closeAllConnection();
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
