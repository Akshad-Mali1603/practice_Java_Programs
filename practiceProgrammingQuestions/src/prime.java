import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= sc.nextInt();
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
				System.out.println("The given number is not prime");
			}else
				System.out.println("The given number is prime");
			
		}
		return;
	}

}
