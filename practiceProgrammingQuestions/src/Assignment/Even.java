package Assignment;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n =sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
