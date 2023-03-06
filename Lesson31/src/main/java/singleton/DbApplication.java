package singleton;

import java.sql.Connection;

public class DbApplication {

    public static void main(String[] args) throws Exception {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = connectionPool.getConnection();
        System.out.println(connection.getCatalog());
        connectionPool.closeConnection(connection);
    }
}
