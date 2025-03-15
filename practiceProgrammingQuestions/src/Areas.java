import java.util.Scanner;
public class Areas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius for circle: ");
		float a=sc.nextFloat();
		float ca=3.14f*a*a;
		System.out.println("The area of circle is: "+ca);
		
		System.out.print("Enter the base and height for Triangle: ");
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		float ta=0.5f*c*d;
		System.out.print("The area of circle is: "+ta);
		
		
		sc.close();
	}

}
