package Inheritance;

import java.util.Scanner;

public class App{
	
	public static void scenario1() {
		Student student1 = new Student(101, "Aksahd Mali", "16/05/2002");
		Student student2 = new Student(102, "Raj Patil", "25/04/2002");
		Student student3 = new Student(103, "Yash Patil", "24/10/2002");
		
		Info info = new Info();
		info.Display(student1);
		info.Display(student2);
		info.Display(student3);
	}
	public static void scenario2() {
		Student student[]= new Student[2];
		student[0]=new Student(104,"Shubham Sathe","10/07/2002");
		student[1]=new Student(105,"Amol Chavan","11/09/2001");
		
		Info info = new Info();
		for (Student st : student) {
			info.Display(st);
		}
	}
	public static void scenario3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students you want to enter: ");
		int n = sc.nextInt();
		Student student[]=new Student[n];
		for (int i = 0; i < student.length; i++) {
			System.out.println("Student: "+i+1);
			System.out.println("Enter the student ID: ");
			int id=sc.nextInt();
			System.out.println("Enter the student Name: ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter the student DOB: ");
			String dob=sc.next();
			
			student[i]=new Student(id, name, dob);
		}
		Info info= new Info();
		for (Student st : student) {
			info.Display(st);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scenario1();
		scenario2();
		scenario3();
		
	}

}
