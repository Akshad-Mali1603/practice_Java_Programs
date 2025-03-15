import java.util.Scanner;

public class TestNum {

	public static void main(String[] args) {

		float x,y;
		Scanner sc = new Scanner(System.in);
		Number num = new Number();
		
			
		while (true) {		
			System.out.println("Enter a 1st number: ");
			x=sc.nextFloat();
			System.out.println("Enter a 2nd number: ");
			y=sc.nextFloat();
			if (x<0 && y<0) {
				System.out.println("INVALID INPUT !!!");
				continue;
			}
		System.out.println("\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. EXIT \nEnter your choice: ");
		int ch=sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Addition is: "+num.add(x, y));
			break;
			
		case 2:
			System.out.println("Addition is: "+num.sub(x, y));
			break;
		case 3:
			System.out.println("Addition is: "+num.mul(x, y));
			break;
		case 4:
			System.out.println("Addition is: "+num.div(x, y));
			break;
			
		case 5:
			System.exit(0);
			break;

		default:
			System.out.println("Invalid choice !!!!!");
			break;
		}
			}
		}
	

}
