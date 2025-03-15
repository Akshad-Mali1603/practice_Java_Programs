package main;

import java.util.Scanner;

import info.CurrentInfo;
import info.SavingInfo;
import sub_class.Current;
import sub_class.Saving;

public class TestAccount {

	public static void main(String[] args) {
		CurrentInfo cinfo = new CurrentInfo();
		SavingInfo sinfo = new SavingInfo();
		Saving sarr[]= null;
		Current carr[]=null;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Create Saving\n2. Display Accounts Information\n3. Deposit Saving\n4. Withdraw Saving\n***********************************\n5. Create Current Account\n6. Display Current Accounts Information\n7. Deposit Current\n8. Withdraw Current\n***********************************\n9. EXIT\nEnter the Choice: ");
			int ch=sc.nextInt();
			
			switch (ch) {
			case 1:
				sarr=sinfo.create();
				
				break;
			case 2:
				if (sarr==null) {
					System.out.println("Account is not found!!");
					break;
				}
				else {
				sinfo.display(sarr);
				}
				break;
			case 3:
				sinfo.deposit(sarr);
				break;
			case 4:
				sinfo.withdraw(sarr);
				break;
			case 5:
				carr=cinfo.create1();
				
				break;
			case 6:
				cinfo.display(carr);
				break;
			case 7:
				cinfo.deposit(carr);
				break;
			case 8:
				cinfo.withdraw(carr);
				break;
			case 9:
				System.exit(0);

			default:
				System.out.println("INVALID CHOICE !!!");
				break;
			}
		}
	}

}
