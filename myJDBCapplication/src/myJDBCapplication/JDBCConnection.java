package myJDBCapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
		public static Connection getConnection(String password) {
			
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system",password);
				return con;
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			
		}

}
