import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnnection {
	
	public static Connection Connection() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection("jdbc:postgresql://dpg-cv4mo0dds78s73e0r4s0-a.oregon-postgres.render.com/empdept","root","6FyctmL1fUp3F7SoVunwsXvI4jXsnJ5G");
	}
	
}	
