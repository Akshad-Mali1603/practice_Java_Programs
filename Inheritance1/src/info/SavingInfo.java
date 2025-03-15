package info;

import java.util.Scanner;

import sub_class.Saving;

public class SavingInfo {
		
		
	public Saving[] create() {
		
		int n;
		String accOwnerName;
		int accNo;
		float accBalance,savingROI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Accounts you want to enter: ");
		n= sc.nextInt();
		
		Saving sr[] = new Saving[n];
		
		for (int i = 0; i < sr.length; i++) {
			
			System.out.println("Saving: "+(i+1));
			System.out.println("Enter Account Number: ");
			accNo=sc.nextInt();
			System.out.println("Enter Owner Name: ");
			sc.nextLine();
			accOwnerName=sc.nextLine();
			System.out.println("Enter Account Balance: ");
			accBalance=sc.nextFloat();
			System.out.println("Enter Account ROI: ");
			savingROI=sc.nextFloat();
			accBalance=(accBalance*savingROI)/100+accBalance;
			sr[i]=new Saving(accNo, accOwnerName, accBalance, savingROI);
			
		}
		
		return sr;
		
	}
	
	public void display(Saving ar[]) {
		
		for (Saving x : ar) {
			
			System.out.println(x);
		}
		
	}
	
	public void deposit(Saving ar[]) {
		
		int no;
		float amt;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a account number: ");
		no=sc.nextInt();
		
		for (Saving x: ar) {
			
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
	
	public void withdraw(Saving ar[]) {
		float amt;
		int no;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a account number: ");
		no=sc.nextInt();
		
		for (Saving x: ar) {
			
			if (x.getAccNo()==no) {
				System.out.println("Enter a amount: ");
				amt=sc.nextFloat();
				if((x.getAccBalance()-amt)<2000) {
					x.setAccBalance(x.getAccBalance()-amt-500);
				System.out.println("Amount withdraw Successfully with Rs.500 service charge!!");
				
				}
				else if ((x.getAccBalance()-amt)>2000) {
					x.setAccBalance(x.getAccBalance()-amt);
					System.out.println("Amount withdraw Successfully !!");
					
				}
				return;
			}
		}
		System.out.println("Account number not found !!!");
		
	}
		
}
