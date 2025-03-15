import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService {
	
	private Connection con = null;
	
	public TeacherService() {
		super();
		try {
			con = JDBCConnnection.connection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void add() {
		 String name;
		 String subject;
		 String department;
		 float exp;
		 float salary;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Teacher Details : ");
		 System.out.println("Name : ");
		 name =sc.nextLine();
		 System.out.println("Subject : ");
		 subject =sc.next();
		 System.out.println("Department : ");
		 department = sc.next();
		 System.out.println("EXP : ");
		 exp = sc.nextFloat();
		 System.out.println("Salary : ");
		 salary = sc.nextFloat();
		 
		 try {
			PreparedStatement psmt = con.prepareStatement("Insert into "
			 		+ "teacher(name,subject,department,exp,salary) "
			 		+ "values(?,?,?,?,?)");
			psmt.setString(1, name);
			psmt.setString(2, subject);
			psmt.setString(3, department);
			psmt.setFloat(4, exp);
			psmt.setFloat(5, salary);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
	
	public List<Teacher> display(){
		List<Teacher> t = new ArrayList<>();
		try {
			ResultSet rs = con.createStatement().executeQuery("Select * from Teacher");
			if (!rs.next()) {
				System.out.println("No record Inserted !!");				
			}
			while(rs.next()) {
				t.add(new Teacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}
	
	
	public void displayTS() {
		List<Student> st= new ArrayList<>();
		ResultSet rs= null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Teacher Id: ");
		int id = sc.nextInt();
		try {
			rs = con.createStatement().executeQuery("Select * from Teacher where id = "+id);
			if (!rs.next()) {
				System.out.println("Invalid Teacher ID !!");
				return;
			}
			System.out.println("Teacher Details: "
					+"\nID : "+rs.getInt(1)
					+"\nName :"+rs.getString(2)
					+"\nSubject : "+rs.getString(3)
					+"\nDepartment : "+rs.getString(4)
					+"\nExperience : "+rs.getFloat(5)
					+"\nSalary : "+rs.getFloat(6));
			
			rs= con.createStatement().executeQuery("select * from student where rollno in (select rollno from student_teacher where id="+id+")");
			while (rs.next()) {
				st.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4)));
			}
			
			System.out.println("\nList of students learn from this teacher are below");
			for (Student x : st) {
				System.out.println(x);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void deleteTeacher() {
		
		Scanner sc = new Scanner(System.in);
		ResultSet rs= null;
		System.out.println("Enter the Teacher id: ");
		int id = sc.nextInt();
		
			try {
				rs = con.createStatement().executeQuery("Select * from Student where rollno = "+id);
				if (!rs.next()) {
					System.out.println("Invalid Teacher Id!!");
					return;
				}else {
					PreparedStatement psmt= con.prepareStatement("delete from Teacher where id = ?");
					psmt.setInt(1, id);
					psmt.executeUpdate();
					System.out.println("Teacher Record deleted successfully !!");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void updateTeacher() {
		Scanner sc = new Scanner(System.in);
		ResultSet rs= null;
		System.out.println("Enter the Teacher id for update record : ");
		int id = sc.nextInt();
		
		try {
			rs = con.createStatement().executeQuery("Select * from Teacher where id = "+id);
			if (!rs.next()) {
				System.out.println("Invalid Teacher Id!!");
				return;
			}else {
				boolean a= true;
				while (a) {
					System.out.println("""
							1. Update Name
							2. Update Subject
							3. Update Department
							4. Update Experience
							5. Update Salary
							6. Exit Update
							Enter the choice: 
							""");
					int ch = sc.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter the name to update : ");
						String name= sc.next();
						PreparedStatement psmt= con.prepareStatement("Update Teacher set name=? where id = ?");
						psmt.setString(1, name);
						psmt.setInt(2, id);
						psmt.executeUpdate();
						System.out.println("Teacher Record name updated successfully !!");
						break;
						
					case 2:
						System.out.println("Enter the subject to update : ");
						String subject= sc.next();
						psmt= con.prepareStatement("Update Teacher set subject=? where id = ?");
						psmt.setString(1, subject);
						psmt.setInt(2, id);
						psmt.executeUpdate();
						System.out.println("Teacher Record subject updated successfully !!");
						break;
					
					case 3:
						System.out.println("Enter the Department to update : ");
						String dept= sc.next();
						psmt= con.prepareStatement("Update Teacher set department=? where id = ?");
						psmt.setString(1, dept);
						psmt.setInt(2, id);
						psmt.executeUpdate();
						System.out.println("Teacher Record department updated successfully !!");
						break;
						
					case 4:
						System.out.println("Enter the experience to update : ");
						int exp= sc.nextInt();
						psmt= con.prepareStatement("Update Teacher set exp=? where id = ?");
						psmt.setInt(1, exp);
						psmt.setInt(2, id);
						psmt.executeUpdate();
						System.out.println("Teacher Record experience updated successfully !!");
						break;
					
					case 5:
						System.out.println("Enter the Salary to update : ");
						float sal= sc.nextFloat();
						psmt= con.prepareStatement("Update Teacher set salary=? where id = ?");
						psmt.setFloat(1, sal);
						psmt.setInt(2, id);
						psmt.executeUpdate();
						System.out.println("Teacher Record salary updated successfully !!");
						break;
					
					case 6:
						System.out.println("Exited from Update !!");
						a=false;
						break;
						
					default:
						System.out.println("INVALID CHOICE !!");
						break;
					}
					
				}
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
