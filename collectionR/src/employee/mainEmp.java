package employee;

import java.util.Scanner;

public class mainEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeeServices emps= new employeeServices();
		Scanner sc= new Scanner(System.in);
		while(true) {
		System.out.println("\nAdd Employee:      [1]"
				         + "\nRemove Employee:   [2]"
				         + "\nDisplay Employee:  [3]"
				         + "\nExit:              [4]");
		int ch= sc.nextInt();
		
		switch (ch) {
		case 1:
			emps.Insert();
			break;
		
		case 2:
			emps.removeEmp();
			break;
			
		case 3:
			emps.Display();
			break;
		default:
			break;
		}
		
		}
	}

}
