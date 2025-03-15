import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		int age;
		String name,address,mob,dob;
		int roll;
		float marks;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a Roll no: ");
		roll= sc.nextInt();
		System.out.println("Enter a Name no: ");
		name= sc.next();
		System.out.println("Enter a Age no: ");
		age= sc.nextInt();
		System.out.println("Enter a Mobile no: ");
		mob= sc.next();
		System.out.println("Enter a DOB no: ");
		dob	= sc.next();
		System.out.println("Enter a Address no: ");
		address = sc.next();
		System.out.println("Enter a Marks no: ");
		marks = sc.nextFloat();
		
		Student s = new Student(age, name, address, mob, dob, roll, marks);
		
		System.out.println(s);
		
		
		sc.close();

	}

}
