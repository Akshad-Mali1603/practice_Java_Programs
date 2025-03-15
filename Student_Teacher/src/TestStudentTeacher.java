import java.sql.ResultSet;
import java.util.Scanner;

public class TestStudentTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		TeacherService ts = new TeacherService();
		StudentService ss = new StudentService();
		RelationTable  rt= new RelationTable();
		while(true) {
			System.out.println("""
					
					1. Add Teacher
					2. Display Teacher
					3. Update Teacher
					4. Delete Teacher
					5. Add Student
					6. Display Student
					7. Update Student
					8. Delete Student
					9. Add Teacher with Student
					10. Search By Teacher ID
					11. Search By Student Roll No.
					12. Exit
					Enter a Choice : 
					""");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				ts.add();
				break;
			case 2:
				for (Teacher x : ts.display()) {
					System.out.println(x);
				}
				break;
			case 3:
				ts.updateTeacher();
				break;
			case 4:
				ts.deleteTeacher();
				break;	
			case 5:
				ss.add();
				break;
			case 6:
				for (Student y : ss.display()) {
					System.out.println(y);
				}
				break;
				
			case 7:
				ss.updateStudent();
				break;
				
			case 8:
				ss.deleteStudent();
				break;
			case 9:
				rt.createRelation();
				break;
				
			case 10:
				ts.displayTS();
				break;
					
			case 11:
				ss.displayST();
				break;
				
			case 12:
				System.exit(0);
			default:
				System.out.println("INVALID CHOICE !!");
				break;
			}
			
		}
	}

}
