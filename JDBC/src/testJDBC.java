import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con= null;
		Statement smt = null;
		PreparedStatement pre= null;
		ResultSet rs= null;
		
		
			con=JDBCConnection.getConnection("Akshad16@");
			try {
				smt = con.createStatement();
				rs= smt.executeQuery("select * from newemployee");
				while (rs.next()) {
					System.out.print(rs.getInt("empID")+" ");
					System.out.println(rs.getString("ename")+" ");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

	}

}
