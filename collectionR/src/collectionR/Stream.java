package collectionR;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int[] arr= {9,7,5,2,4,1,9,3};
	
		Object max1= Arrays.stream(arr).max();
		
		System.out.println(max1);
		

	}

}
