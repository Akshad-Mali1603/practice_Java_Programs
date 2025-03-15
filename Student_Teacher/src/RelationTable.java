import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RelationTable {

	private Connection con = null;

	public RelationTable() {
		super();
		try {
			con = JDBCConnnection.connection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void createRelation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Teacher Id: ");
		int id = sc.nextInt();
		try {
			ResultSet rs= con.createStatement().executeQuery("Select * from Teacher where id = "+id);
			if (!rs.next()) {
				System.out.println("Invalid Teacher ID !!");
				return;
			}
			System.out.println("Enter the Student roll no: ");
			int rollno= sc.nextInt();
			rs= con.createStatement().executeQuery("Select * from Student where rollno = "+rollno);
			if (!rs.next()) { 
				System.out.println("Invalid Student ID !!");				
				return;
			}
			PreparedStatement psmt = con.prepareStatement("Insert into student_teacher values(?,?)");
			psmt.setInt(1, rollno);
			psmt.setInt(2, id);
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
