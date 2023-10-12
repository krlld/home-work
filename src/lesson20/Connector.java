package lesson20;

import java.sql.*;

public class Connector {
    public static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lesson20", "root", "12345678");
        }
        return connection;
    }
}
