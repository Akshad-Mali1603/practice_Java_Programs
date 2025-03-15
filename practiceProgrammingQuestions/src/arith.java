import java.util.Scanner;

public class arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a= sc.nextInt();
		b= sc.nextInt();
		
		System.out.println("Addition: "+(a+b));
		System.out.println("Substraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		
		
		sc.close();

	}

}