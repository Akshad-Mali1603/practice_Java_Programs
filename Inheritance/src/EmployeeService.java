import java.util.Scanner;

public class EmployeeService {

	public static void create(Employee[] emp, int n) {
		int id;
		String dept;
		float salary;
		int age;
		String name,address,mob,dob;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee : "+(i+1));
			System.out.println("ID : ");
			id = sc.nextInt();
			System.out.println("Enter a Name: ");
			name = sc.next();
			System.out.println("Enter a department: ");
			dept= sc.next();
			System.out.println("Enter the salary: ");
			salary = sc.nextFloat();
			System.out.println("Enter a mobile number: ");
			mob= sc.next();
			System.out.println("Enter a DOB: ");
			dob = sc.next();
			System.out.println("Enter a Age: ");
			age=  sc.nextInt();
			System.out.println("Enter a address: ");
			address = sc.next();
			
			emp[i] = new Employee(age, name, address, mob, dob, id, dept, salary);
			
			
		}
		
	}

	public static Employee search(Employee[] emp, int n, int id) {
		for (int i = 0; i < n; i++) {
			if (emp[i].getId()==id) {
				return emp[i];
				
			}
			
		}
		return null;
	}

	public static Employee search(Employee[] emp, int n, String name) {
		for (int i = 0; i < n; i++) {
			if (emp[i].getName().equalsIgnoreCase(name)) {
				return emp[i];
				
			}
		
		
	}
		return null;
	
}

	public static int delete(Employee[] emp, int n, int id) {
		for (int i = 0; i < n; i++) {
			if (emp[i].getId()==id) {
			for (int j = i; j < n-1; j++) {
				emp[j] = emp[j+1];	
			}
			n--;
			}	
		}
			
		return n;
		}

	public static void display(Employee[] emp, int n) {
		
		for (int i = 0; i < n; i++) {
			System.out.println(emp[i]);
			
		}
	}
	}
