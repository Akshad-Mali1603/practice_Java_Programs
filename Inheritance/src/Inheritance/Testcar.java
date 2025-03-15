package Inheritance;

import java.util.Scanner;

public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		String color;
		int seat;
		String fuel;
		float price;
		float mileage;
		String companyName;
		String companyLocation;
		String companyMob;
		String companyRegDate;
		String companyRegNo;
		String carOwnerName;
		int carInsuranceNO;
		String carType;
		String carNo;
		String carMode;
		boolean carAutomatic;
		String carCompanyName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter vehical no: ");
		no=sc.nextInt();
		System.out.println("Enter color of vehical: ");
		color=sc.next();
		System.out.println("Enter seats capacity: ");
		seat=sc.nextInt();
		System.out.println("Enter fuel type: ");
		fuel= sc.next();
		System.out.println("Enter a pice of the car: ");
		price=sc.nextFloat();
		System.out.println("Enter a mileage of car: ");
		mileage=sc.nextFloat();
		System.out.println("Enter company Name: ");
		companyName= sc.next();
		System.out.println("Enter Comapny Location: ");
		companyLocation= sc.next();
		System.out.println("Enter Company mobile no: ");
		companyMob= sc.next();
		System.out.println("Enter Company registration date: ");
		companyRegDate= sc.next();
		System.out.println("Enter Company registration NO: ");
		companyRegNo= sc.next();
		System.out.println("Enter Car Qnwer name: ");
		carOwnerName= sc.next();
		System.out.println("Enter car insurance no: ");
		carInsuranceNO= sc.nextInt();
		System.out.println("Enter car type: ");
		carType= sc.next();
		System.out.println("Enter a car no: ");
		carNo= sc.next();
		System.out.println("Enter a Car mode: ");
		carMode= sc.next();
		System.out.println("Enter car Automatic: ");
		carAutomatic= sc.nextBoolean();
		System.out.println("Enter car company name: ");
		carCompanyName= sc.next();
		
		Car cr = new Car(no, color, seat, fuel, price, mileage, companyName, companyLocation, companyMob, companyRegDate, companyRegNo, carOwnerName, carInsuranceNO, carType, carNo, carMode, carAutomatic, carCompanyName);
		System.out.println(cr);				
	}

}
