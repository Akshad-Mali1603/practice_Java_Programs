import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class projectServices {
	private Connection con= null;
	
	 public projectServices() {
		super();
		try {
			con = JDBCConnnection.connection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 public void addProject() {
			 String name;
			 String technology;
			 
			 Scanner sc= new Scanner(System.in);
			 
			 System.out.println("Enter name: ");
			 name= sc.next();
			 System.out.println("Enter Technology: ");
			 technology= sc.next();
			 
			 try {
				PreparedStatement psmt= con.prepareStatement("insert into project(name,technology) values(?,?)");
				psmt.setString(1, name);
				psmt.setString(2, technology);
				psmt.executeUpdate();
				System.out.println("Project created successfully !!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	 public List<project> display(){
			List<project> pr = new ArrayList<>();
			try {
				ResultSet rs = con.createStatement().executeQuery("Select * from project");
				if (!rs.next()) {
					System.out.println("No record Inserted !!");				
				}
				while(rs.next()) {
					pr.add(new project(rs.getInt(1),rs.getString(2),rs.getString(3)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return pr;
		}
	 
	
}
