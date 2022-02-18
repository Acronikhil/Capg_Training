package dayeleven.jdbcapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtils {
	private static final String url =  "jdbc:mysql://localhost:3306/test" ;
	
	public static Connection getDBConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
