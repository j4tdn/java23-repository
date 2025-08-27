package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {

	private static Connection connection;

	private Dbconnection() {
	}

	public static Connection getConnection() {
		if (connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam", "root", "Tai123");
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		return connection;
	}
}