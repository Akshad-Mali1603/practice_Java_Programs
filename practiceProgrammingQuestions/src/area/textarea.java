package area;

import java.util.Scanner;

public class textarea{

	public static void main(String[] args) {
		
		int ch;
		double r,side,l,b;
		Area a=new Area();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("\n1.circle \n2.square \n3 rectangle \n4 exit \n enter a choice:");
		ch=sc.nextInt();
		
		switch (ch) {
		case 1:
			System.out.println("enter radius :");
			r=sc.nextDouble();
			System.out.println("area of circle"+a.circle(r));
			break;
		case 2:
			System.out.println("enter side :");
			side=sc.nextDouble();
			System.out.println("area of square"+a.square(side));
			break;
		case 3:
			System.out.println("enter length and breadth:");
			l=sc.nextDouble();
			b=sc.nextDouble();
			System.out.println("area of rectangle"+a.rectangle(l,b));
			break;
		case 4:
			System.exit(0);
		default:
			break;
		}
sc.close();
	   }
	}
}