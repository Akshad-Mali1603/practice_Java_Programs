package Inheritance;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int temp=1;
		int i=1;
		while (i<=n/2) {
			if (n%i==0) {
				temp++;				
			}
			i++;
		}
		if (temp==2 && n!=0) {
			System.out.println("The number "+n+" is prime number");
			
		}else
			System.out.println("The number "+n+" is not a prime number");
	sc.close();	
	}

}
