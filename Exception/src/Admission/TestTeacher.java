package Admission;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class TestTeacher {
	
	public static void main(String[]args) {
		int id;
		String name;
		String dept;
		String email;
		String mob;
		float salary;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many record you want to enter: ");
		int n=sc.nextInt();
		Teacher t[] = new Teacher[n];
		for (int i = 0; i < t.length; i++) {
			while (true) {
				try {
					System.out.println("Enter teacher id: ");
					id=sc.nextInt();
					for (int j = 0; j < i; j++) {
						if (t[j].getId()==id) {
							throw new Exception("Please enter another id \nThis id is already exist !!");				
						}break;
					}
					
				}catch (InputMismatchException e) {
					System.out.println("Enter a valid number !!");
				} 
				catch (Exception e) {
					System.out.println(e.getMessage());
				}finally {
					sc.nextLine();
				}		
				
			}
			while (true) {
				try {
					System.out.println("Enter a Salary: ");
					salary=sc.nextFloat();
				if (salary<10000) {
					throw	new	Exception("Invalid Salary !!");					
				}break;
				}catch (InputMismatchException e) {
					System.out.println("Enter a number only !!!");
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
				finally {
					sc.nextLine();
				}
			}
			while (true) {
				try {
					System.out.println("Enter a mobile number: ");
					mob=sc.next();
					if (mob.length()!=10) {
						throw new Exception("Invalid Mobile Number !!");
					}
					for (int j = 0; j < mob.length(); j++) {
							if (Character.isAlphabetic(mob.charAt(j))) {
								throw new Exception("Please enter numbers only !!");
							}break;				
					}
					for (int j = 0; j < mob.length(); j++) {
						if (t[j].getMob().equals(mob)) {
							throw new Exception("Please enter numbers only !!");
						}break;				
				}
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}	
			}
			
			
	}
}
