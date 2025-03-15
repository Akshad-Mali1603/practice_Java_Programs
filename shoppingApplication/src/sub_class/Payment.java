package sub_class;

import java.util.Scanner;

public class Payment {

	Scanner sc = new Scanner(System.in);

	public boolean processPayment(float totalAmount) {

		System.out.println("\nPayment Options :"
							+"\nCredit Card   [1]"
							+"\nDebit Card    [2]"
							+"\nUPI           [3]"
							+"\nCash          [4]"
							+"\nCancel Payment[5]"
							+"\nChoose Payment Method(1/2/3/4/5):");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
		case 2:
			System.out.println("Enter Card Number: ");
			long cardNumber = sc.nextLong();
			System.out.println("\u001B[1;32mProcessing payment...\u001B[0m");
			return true;
		case 3:
			System.out.println("Enter UPI ID: ");
			String upiId = sc.next();
			System.out.println("\u001B[1;32mProcessing payment...\u001B[0m");
			return true;
		case 4:
			System.out.println("\u001B[1;32mCash Payment Selected !! Please Pay at Counter\u001B[0m");
			return true;
		
		case 5:
			return false;
		default:
			System.out.println("\u001B[1;31mInvalid Payment Method! Payment Failed.\u001B[0m");
			return false;
		}
	}
}
