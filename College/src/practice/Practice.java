package practice;

import java.util.Iterator;
import java.util.Scanner;
import java.math.*;
public class Practice {

	public static void main(String[] args) {
		int vn,arr[] = null,n=0,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("how many elements to enter in array: ");
		arr[n]= sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a elements: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to search: ");
		m=sc.nextInt();
		double sq=Math.sqrt(m);
		for (double i = sq; i < arr.length; i=sq+sq) {
			if (arr[i]<m) {
				for (double j = sq; j <arr.length ;) {
					
				}
			}
		}
		
		
	}

}
