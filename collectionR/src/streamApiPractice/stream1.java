package streamApiPractice;

import java.awt.print.Printable;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		while (true) {
			
			System.out.println("\n1. Enter the numbers "
					+ "\n2. Display all even numbers"
					+ "\n3. EXIT");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the number: ");
				Integer n=sc.nextInt();
				list.add(n);
				
				break;
			case 2:
				 
				list.stream().filter(x -> x%2==0).forEach(System.out::println);
				break;
			case 3:
				System.exit(0);

			default:
				break;
			}
		}
	}

}
