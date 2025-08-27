package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static Connection connection;

    private DbConnection() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java23_shopping", "root", "Thien123");
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}