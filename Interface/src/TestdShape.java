import java.util.Scanner;

public class TestdShape {

	public static void main(String[] args) {
		float x,y;
		Shaps sp = new Shaps();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n1. Circle\n2. Square\n3. Rectangle\n4. Exit\nEnter Your choice: ");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter a Radius: ");
				x=sc.nextFloat();
				System.out.println("Area of circle: "+sp.areacir(x));
				System.out.println("Circumferance of circle: "+sp.percir(x));
				break;
				
			case 2:
				System.out.println("Enter a Side: ");
				x=sc.nextFloat();
				System.out.println("Area of Square: "+sp.areasq(x));
				System.out.println("Perimeter of Square: "+sp.persq(x));
				break;
				
			case 3:
				System.out.println("Enter a Length: ");
				x=sc.nextFloat();
				System.out.println("Enter a Breadth: ");
				y=sc.nextFloat();
				System.out.println("Area of Rectangle: "+sp.arearec(x, y));
				System.out.println("Perimeter of Rectangle: "+sp.perrec(x, y));
				break;
				
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice !!!");
				break;
			}
		}
	}

}
