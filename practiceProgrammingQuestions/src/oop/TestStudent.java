package oop;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll;
		String name;
		float marks;
		int n;
		Student result;
		Scanner  sc = new Scanner (System.in);
		System.out.println("Enter the number of student: ");
		n=sc.nextInt();
		
		System.out.println("Enter the student details: ");
		
		Student s[] = new Student[n];
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("Student: "+(i+1));
			System.out.println("Enter the roll: ");
			roll=sc.nextInt();
			System.out.println("Enter the name: ");
			name=sc.next();
			System.out.println("Enter the marks: ");
			marks=sc.nextFloat();
			
			s[i]=new Student(roll,name,marks);
					
			
		}
		while(true) {
			System.out.println("\n1.Search by roll \n2.Search by name \n3.Exit \n Enter the choice: ");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the roll: ");
				roll=sc.nextInt();
				result=Student.search(s, roll);
				if (result==null) {
					System.out.println("Data is not found!!");
				}else {
					System.out.println(result);
				}
				break;
			case 2:
				System.out.println("Enter the name: ");
				name=sc.next();
				result=Student.search(s, name);
				if (result==null) {
					System.out.println("Data is not found!!");
				}else {
					System.out.println(result);
				}
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid Choice!!!");
				break;
			}
		}
	}

}
