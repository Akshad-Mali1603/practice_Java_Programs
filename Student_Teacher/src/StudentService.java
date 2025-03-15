import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {

	private Connection con = null;

	public StudentService() {
		super();
		try {
			con = JDBCConnnection.connection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void add() {
		 String name;
		 String division;
		 float marks;
		 int id;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Teacher ID : ");
		 id = sc.nextInt();
		 try {
			ResultSet rs = con.createStatement().executeQuery("Select * from Teacher where id = "+id);
			if(!rs.next()) {
				System.out.println("INVALID TEACHER ID !! ");
				return;
			}
			System.out.println("Enter Student Details : ");
			System.out.println("Name : ");
			name = sc.nextLine();
			System.out.println("Division : ");
			division =sc.next();
			System.out.println("Marks : ");
			marks = sc.nextFloat();
			PreparedStatement psmt = con.prepareStatement("Insert into "
					+ "Student(name,division,marks)"
					+ " values(?,?,?)");
			psmt.setString(1, name);
			psmt.setString(2, division);
			psmt.setFloat(3, marks);
			psmt.executeUpdate();
			
			Statement smt = con.createStatement();
			rs  = smt.executeQuery("Select * from Student order by rollno desc");
			rs.next();
			int rollno = rs.getInt(1);
			psmt = con.prepareStatement("Insert into student_teacher values(?,?)");
			psmt.setInt(1, rollno);
			psmt.setInt(2, id);
			psmt.executeUpdate();
			System.out.println("Record inserted successfully");
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	public List<Student> display(){
		List<Student> stu = new ArrayList<>();
		boolean flag=true;
		try {
			ResultSet rs = con.createStatement().executeQuery("Select * from Student");
			
			while(rs.next()) {
				flag=false;
				stu.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4)));
			}
			if (flag) {
				System.out.println("No record Inserted !!");				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stu;
	}
	
	public void displayST() {
		List<Teacher> th= new ArrayList<>();
		ResultSet rs= null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Roll No: ");
		int rollno = sc.nextInt();
		try {
			rs = con.createStatement().executeQuery("Select * from Student where rollno = "+rollno);
			if (!rs.next()) {
				System.out.println("Invalid Studnet Roll No !!");
				return;
			}
			System.out.println("Student Details: "
					+"\nRoll No : "+rs.getInt(1)
					+"\nName :"+rs.getString(2)
					+"\nDivision : "+rs.getString(3)
					+"\nMarks : "+rs.getFloat(4));
			
			rs= con.createStatement().executeQuery("select * from Teacher where id in (select id from student_teacher where rollno="+rollno+")");
			while (rs.next()) {
				th.add(new Teacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6)));
			}
			
			System.out.println("\nList of students learn from this teacher are below");
			for (Teacher x : th) {
				System.out.println(x);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void deleteStudent() {
		
		Scanner sc = new Scanner(System.in);
		ResultSet rs= null;
		System.out.println("Enter the Student Roll No: ");
		int rollno = sc.nextInt();
		
			try {
				rs = con.createStatement().executeQuery("Select * from Student where rollno = "+rollno);
				if (!rs.next()) {
					System.out.println("Invalid Studnet Roll No !!");
					return;
				}else {
					PreparedStatement psmt= con.prepareStatement("delete from Student where rollno = ?");
					psmt.setInt(1, rollno);
					psmt.executeUpdate();
					System.out.println("Record deleted successfully !!");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void updateStudent() {
		Scanner sc = new Scanner(System.in);
		ResultSet rs= null;
		System.out.println("Enter the Student roll no for update record : ");
		int rollno = sc.nextInt();
		
		try {
			rs = con.createStatement().executeQuery("Select * from Student where rollno = "+rollno);
			if (!rs.next()) {
				System.out.println("Invalid roll no !!");
				return;
			}else {
				boolean a= true;
				while (a) {
					System.out.println("""
							1. Update Name
							2. Update Division
							3. Update Marks					
							4. Exit Update
							Enter the choice: 
							""");
					int ch = sc.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter the name to update : ");
						String name= sc.next();
						PreparedStatement psmt= con.prepareStatement("Update Student set name=? where rollno = ?");
						psmt.setString(1, name);
						psmt.setInt(2, rollno);
						psmt.executeUpdate();
						System.out.println("Student Record name updated successfully !!");
						break;
						
					case 2:
						System.out.println("Enter the division to update : ");
						String div= sc.next();
						psmt= con.prepareStatement("Update Student set division=? where rollno = ?");
						psmt.setString(1, div);
						psmt.setInt(2, rollno);
						psmt.executeUpdate();
						System.out.println("Student Record division updated successfully !!");
						break;
					
					case 3:
						System.out.println("Enter the Marks to update : ");
						String mark= sc.next();
						psmt= con.prepareStatement("Update Student set marks=? where rollno = ?");
						psmt.setString(1, mark);
						psmt.setInt(2, rollno);
						psmt.executeUpdate();
						System.out.println("Studnet Record marks updated successfully !!");
						break;
					
					case 4:
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
