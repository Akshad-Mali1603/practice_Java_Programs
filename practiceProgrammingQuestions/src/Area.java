import java.util.Scanner;
public class Area{
	Scanner sc = new Scanner(System.in);
	public void circleArea(){
		System.out.println("Enter the radius of circle: ");
		float r = sc.nextFloat();
		float ca =3.14f*r*r;
		System.out.println("The area of circle is: "+ca);
	}
	public void triangleArea() {
		System.out.println("Enter the base and height of triangle: ");
		float b= sc.nextFloat();
		float h=sc.nextFloat();
		float ta=0.5f*b*h;
		System.out.println("The Area of triangle is: "+ta);
	}
}
