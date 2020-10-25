package asgmt5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getConnection() {
		
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_db", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
