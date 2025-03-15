import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		int id;
		String dept;
		float salary;
		int age;
		String name,address,mob,dob;
		Employee result= null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many record you want to enter: ");
		int n= sc.nextInt();
		
		Employee emp[] = new Employee[n];
		EmployeeService.create(emp, n);
		
		
		while(true) {
			System.out.println("1. Search by ID: \n2. Search by Name: \n3. Delete\n4. Display\n5. Enter a choice: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter a ID: ");
				id= sc.nextInt();
				result = EmployeeService.search(emp,n,id);
				if (result == null) {
					System.out.println("ID not FOUND!!");
				}else
					System.out.println(result);
				break;
				
			case 2:
				System.out.println("Enter a name: ");
				name = sc.next();
				result = EmployeeService.search(emp, n,name);
				if (result == null) {
					System.out.println("Name not FOUND!!");
				}else
					System.out.println(result);
				break;
				
			case 3:
				System.out.println("Enter a ID: ");
				id=sc.nextInt();
				n= EmployeeService.delete(emp,n,id);
				break;
				
			case 4:
				EmployeeService.display(emp,n);
				break; 
				
			case 5:
				System.exit(0);
				break;
				
			default:
				System.out.println("INVALID CHOICE !!");
				break;
			}
		}
		
	}

}
