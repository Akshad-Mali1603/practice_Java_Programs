package myJDBCapplication;

import java.util.Scanner;

public class myJDBCappExe {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("\nEnter the operation you want to perform: "
				+ "\nCreate Table into the DataBase : [1]"
				+ "\nDisplay All Tables of DataBase : [2]"
				+ "\nInsert Records into the table  : [3]"
				+ "\nExit                           : [4]");
		int ch= sc.nextInt();
		operationsOfJDBC op= new operationsOfJDBC();
		switch (ch) {
		case 1:
			op.createTable();
			break;
			
		case 2:
			op.DisplayTables();
			break;
			
		case 3:
			op.DisplayTables();
			op.InsertRecord();
		
		case 4:
			System.exit(0);
						
		default:
			System.out.println("Invalid Choice !!");
			break;
		}
	  }
	}

}
