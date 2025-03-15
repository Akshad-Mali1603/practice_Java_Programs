import java.sql.Connection;
import java.sql.SQLException;

public class departmentService {
	private Connection con=null;
	
	public departmentService() {
		super();
		// TODO Auto-generated constructor stub
		try {
			con= JDBCConnnection.connection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
	
}
