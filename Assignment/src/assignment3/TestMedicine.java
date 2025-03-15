package assignment3;

import java.util.Random;
import java.util.Scanner;

public class TestMedicine {

	public static void main(String[] args) {
		int n=0;
		Scanner sc = new Scanner(System.in);
		Medicine md[] = new Medicine[10];
		Random ra = new Random();
		for (int i = 0; i < 10; i++) {
			int medi=ra.nextInt(1,4);
			switch (medi) {
			case 1:
				md[n]=new Tablet();
				md[n].displayLabel();
				n++;	
				break;
			case 2:
				md[n]=new Syrup();
				md[n].displayLabel();
				n++;	
				break;
			case 3:
				md[n]=new Ointment();
				md[n].displayLabel();
				n++;	
				break;
		
			}
			
		}
		System.out.println("***********************************************************************");
		for (int i = 0; i < md.length; i++) {
			System.out.println("Index: "+i);
			md[i].displayLabel();
		}
	}

}
