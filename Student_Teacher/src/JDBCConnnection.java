import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnnection {
	
	public static Connection connection() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection("jdbc:postgresql://dpg-cv3kjrl2ng1s738i13ag-a.oregon-postgres.render.com/student_teacher_82t6","root","lZUegg9dnl5J8Zls8yyQbRSA9mIIgoem");
	}
	
}	
