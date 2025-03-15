package collectionR;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Stream;

public class treeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts= new TreeSet<Integer>();
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			ts.add(sc.nextInt());
			
		}
		System.out.println("The Given numbers are:");
		for (Integer integer : ts) {
			System.out.println(integer);
		}
		System.out.println("Enter the number for the search: ");
		int key= sc.nextInt();
		
		if (ts.contains(key)) {
			System.out.println("Number Foud !!");
			
		}else {
			System.out.println("Number not Found !!");
		}

	}

}
