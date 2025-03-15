import java.util.Scanner;

public class areamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str=null;
		Areass obj = new Areass();
		do {
		System.out.println("1.Area of circle\n2.Area of triangle\n3.Area of rectangle\nEnter the choice: ");
		int ch=sc.nextInt();
		
		switch(ch) {
		
		case 1:
			System.out.println("Enter the radius for the circle: ");
			float r=sc.nextFloat();
			float carea=obj.circlea(r);
			System.out.println("Area of circle is: "+carea);
			break;
			
		case 2:
			System.out.println("Enter the base and height for triangle: ");
			float b=sc.nextFloat();
			float h=sc.nextFloat();
			float tarea=obj.trianglea(b,h);
			System.out.println("Area of triangle is: "+tarea);
			break;
		case 3:
			System.out.println("Enter the length and breadth of rectangle: ");
			float l=sc.nextFloat();
			float bh=sc.nextFloat();
			float rarea=obj.rectanglea(l,bh);
			System.out.println("Area of rectangle is: "+rarea);
			break;
		case 4:
			break;
		}
			System.out.println("Do you want to continue or not press yes/no: ");
			str=sc.next();
		
		
		}while(str.equals("yes"));
		System.out.println("................Thank You..................");
		sc.close();
	}

}
