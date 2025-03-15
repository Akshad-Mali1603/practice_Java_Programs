package main;

import java.util.Scanner;

import sub_class.FullTime;
import sub_class.PartTime;

public class TestWorker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FullTime full[]=new FullTime[100];
		PartTime part[]=new	PartTime[100];
		
		int pn,fn,loc=-1;
		pn=fn=0;
		int id,flag=0;
		while (true) {
			System.out.println("1. Create Full Time Worker\n2. Display Full Time Worker\n3. Update Full Time Worker\n4. Display Full Time Worker Salary\n5. Create Part Time Worker\n6. Display Part Time Worker\n7. Update Part Time Worker\n8. Exit\nEnter a choice: ");
			int ch =sc.nextInt();
			switch (ch) {
			case 1:
				full[fn]=new FullTime();
				full[fn].create();
				fn++;
				break;
				
			case 2:
				for (int i = 0; i <fn; i++) {
					full[i].display();
				}
				break;
				
			case 3:
				System.out.println("Enter a ID: ");
				id=sc.nextInt();
				flag=0;
				for (int i = 0; i < fn; i++) {
					if (id==full[i].getId()) {
						flag=1;
						loc=i;
						break;
					}
				}if (flag==1) {
					System.out.println("1. Name\n2. Age\n3. Mobile Number\n4. Salary\n5. Extra Hours\n6. Rate per hours");					
					int choice=sc.nextInt();
					System.out.println("Enter a value: ");
					Object data;
					if(choice==2||choice==5)
						data=sc.nextInt();
					elseif
						
					full[loc].update(choice, data);
				}else
					System.out.println("Invalid ID !!!");
				break;
			case 8:
				System.exit(0);

			default:
				System.out.println("Invalid Choice !!");
				break;
			}
		}
	}

}
