package oop;
 
import java.util.Scanner;

public class MainEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		float salary;
		String address,name,department;
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many records you want to insert: ");
		int n=sc.nextInt();
		
		Employee emp[]=new Employee[n];
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			System.out.println("Enter a id: ");
			id=sc.nextInt();
			emp[i].setId(id);
			
			System.out.println("Enter a name: ");
			name=sc.next();
			emp[i].setName(name);
			
			System.out.println("Enter a address: ");
			address=sc.next();
			emp[i].setAddress(address);
			
			System.out.println("Enter a department: ");
			department=sc.next();
			emp[i].setDepartment(department);
			
			System.out.println("Enter a year: ");
			year=sc.nextInt();
			emp[i].setYear(year);
			
			System.out.println("Enter a salary: ");
			salary=sc.nextInt();
			emp[i].setSalary(salary);
		}
			for (Employee employee : emp) {
				System.out.println(employee);
			}
			
			
		
		
		sc.close();
		
		
		
	}

}
