import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		Statement smt = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		int id;
		String dept,name;
		float salary;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://dpg-cuvfe95ds78s73ckvsi0-a.oregon-postgres.render.com:5432/employee_ogy6","employee_ogy6_user","8U9SKIU5CLm3fIOM1FbqC69AKCMhPsWN");
			smt = con.createStatement();
			smt.execute("create table if not exists employee("
					+ "id int primary key,"
					+ "name varchar,"
					+ "department varchar,"
					+ "salary float"
					+ ")");
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			System.out.println("\n1. Insert"
					+ "\n2. Display"
					+ "\n3. Update"
					+ "\n4. Delete"
					+ "\n5. EXIT"
					+ "\nEnter a Choice : ");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter Employee Details : ");
				System.out.println("ID : ");
				id = sc.nextInt();
				System.out.println("Name : ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.println("Department : ");
				dept = sc.next();
				System.out.println("Salary : ");
				salary = sc.nextFloat();
				
				try {
					psmt = con.prepareStatement("Insert into employee values(?,?,?,?)");
					psmt.setInt(1, id);
					psmt.setString(2, name);
					psmt.setString(3, dept);
					psmt.setFloat(4,salary);
					psmt.executeUpdate();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					rs = smt.executeQuery("Select * from employee");
					while(rs.next()) {
						System.out.print(rs.getInt(1)+" ");
						System.out.print(rs.getString(2)+" ");
						System.out.print(rs.getString(3)+" ");
						System.out.println(rs.getFloat(4));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				break;
			case 4:
				try {
					System.out.println("Enter a Employee ID : ");
					id = sc.nextInt();
					smt.execute("delete from employee where id = "+id);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("INVALID CHOICE !!");
				break;
			}
		}
		
	}

}
