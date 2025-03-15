import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class testJDBC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement smt = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
	
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","Akshad16@");
			smt = con.createStatement();
			
//			smt.execute("create table customer("
//					+ "    cid number primary key,"
//					+ "    name varchar2(50),"
//					+ "    mob varchar2(50),"
//					+ "    address varchar2(500),"
//					+ "    qty number,"
//					+ "    total number,"
//					+ "    bid number reference book(bid)"
//					+ ")");
			
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
