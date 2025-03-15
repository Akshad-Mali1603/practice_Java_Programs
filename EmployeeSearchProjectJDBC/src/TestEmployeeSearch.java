import java.util.Scanner;

public class TestEmployeeSearch{

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	projectServices pr= new projectServices();
	
	while(true) {
	System.out.println("""
			1. Add Project
			2. Add Department
			3. Add Employee
			4. Search
			5. Exit
			Enter the Choice: 
			""");
	int ch=sc.nextInt();
	switch (ch) {
	case 1:
		pr.addProject();
		break;
		
	case 4:
		new searchAny();
		break;
	
	case 5:
		System.exit(0);

	default:
		System.out.println("INVALID CHOICE !!");
		break;
		}
	}
	}
}
