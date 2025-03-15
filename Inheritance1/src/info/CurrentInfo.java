package info;

import java.util.Scanner;

import sub_class.Current;

public class CurrentInfo {
public Current[] create1() {
		
		int n;
		String accOwnerName;
		int accNo;
		float accBalance;
		String currentCompanyName;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Accounts you want to enter: ");
		n= sc.nextInt();
		
		Current cr[] = new Current[n];
		
		for (int i = 0; i < cr.length; i++) {
			
			System.out.println("Current: "+(i+1));
			System.out.println("Enter Account Number: ");
			accNo=sc.nextInt();
			System.out.println("Enter Owner Name: ");
			sc.nextLine();
			accOwnerName=sc.nextLine();
			System.out.println("Enter Account Balance: ");
			accBalance=sc.nextFloat();
			System.out.println("Enter Account current Company Name: ");
			sc.nextLine();
			currentCompanyName=sc.nextLine();
			
			cr[i]=new Current(accNo, accOwnerName, accBalance, currentCompanyName);
			n++;
		}
		
		return cr;
	}
	
	public void display(Current ar[]) {
		for (Current x : ar) {
			System.out.println(x);
		}
		
	}
	
	
	
	public void deposit(Current ar[]) {
		float amt;
		int no;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a account number: ");
		no=sc.nextInt();
		
		for (Current x: ar) {
			
			if (x.getAccNo()==no) {
				System.out.println("Enter a amount: ");
				amt=sc.nextFloat();
				x.setAccBalance(x.getAccBalance()+amt);
				System.out.println("Amount Deposit Successfuly !!");
				return;
			}
		}
		System.out.println("Account number not found !!!");
		
	}
	
	
	
	public void withdraw(Current ar[]) {
		float amt;
		int no;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a account number: ");
		no=sc.nextInt();
		
		for (Current x: ar) {
			
			if (x.getAccNo()==no) {
				System.out.println("Enter a amount: ");
				amt=sc.nextFloat();
				if((x.getAccBalance()-amt)<5000) {
					x.setAccBalance(x.getAccBalance()-amt-1000);
				System.out.println("Amount withdraw Successfully with Rs.1000 service charge!!");
				}
				else if ((x.getAccBalance()-amt)>5000) {
					x.setAccBalance(x.getAccBalance()-amt);
					System.out.println("Amount withdraw Successfully !!");
				}
				return;
			}
		}
		System.out.println("Account number not found !!!");
		
	}
		
}

