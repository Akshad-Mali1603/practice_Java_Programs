import java.util.Scanner;


class MyFruit{
	
	public static void main(String[] args) {
		String name;
		String color;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the fruit: ");
		name = sc.next();
		System.out.println("Enter the color of the fruit: ");
		color = sc.next();
		
		Fruits ft = new Fruits(name, color);
		System.out.println(ft);
		sc.close();
	
	}

}
