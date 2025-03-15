package info;

import java.util.Scanner;

import sub_class.Manager;

public class ManagerInfo {

	public Manager[] create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number of employee you want to enter: ");
		int n = sc.nextInt();
		Manager manager1[] = new Manager[n];
		for (int i = 0; i < manager1.length; i++) {
			System.out.println("Enter employee: " + (i + 1));
			System.out.println("Enter the Employee ID: ");
			int id = sc.nextInt();
			System.out.println("Enter the department of employee: ");
			String dept = sc.next();
			System.out.println("Enter the name: ");
			String name = sc.next();
			System.out.println("Enter the age: ");
			int age = sc.nextInt();
			System.out.println("Enter the Mobile no: ");
			String mob = sc.next();
			System.out.println("Enter the address: ");
			String address = sc.next();
			System.out.println("Enter the Basic salary: ");
			float basicSalary = sc.nextFloat();
			System.out.println("Enter the pf account no: ");
			String pfaccno = sc.next();
			System.out.println("Enter the Tax in ? % is less than 100%: ");
			float tax1 = sc.nextFloat();
			float tax = (basicSalary * tax1) / 100;
			System.out.println("Enter the da in ? % is less than 100%: ");
			float da1 = sc.nextFloat();
			float da = (basicSalary * da1) / 100;
			System.out.println("Enter the hra in ? % is less than 100%: ");
			float hra1 = sc.nextFloat();
			float hra = (basicSalary * hra1) / 100;

			float totalSalary = basicSalary + (basicSalary * ((da + hra - tax) / 100));

			manager1[i] = new Manager(id, dept, basicSalary, pfaccno, tax, da, hra, totalSalary);
		}
//			ManagerInfo manager2=new ManagerInfo();
//			for (Manager manager : manager1) {
//				manager2.Display(manager);
//			}
		return manager1;
	}

	public void display(Manager arr[]) {

		for (Manager manager : arr) {
			System.out.println("Employee ID: " + manager.getId());
			System.out.println("Name: " + manager.getName());
			System.out.println("Age: " + manager.getAge());
			System.out.println("Mobile no: " + manager.getMob());
			System.out.println("Address: " + manager.getAddress());
			System.out.println("Basic Salary: " + manager.getBasicSalary());
			System.out.println("PF of employee: " + manager.getPfaccno());
			System.out.println("Tax: " + manager.getTax());
			System.out.println("DA: " + manager.getDa());
			System.out.println("HRA: " + manager.getHra());
			System.out.println("Total salary: " +manager.getTotalSalary()+"\n\n");
		}
	}
}
