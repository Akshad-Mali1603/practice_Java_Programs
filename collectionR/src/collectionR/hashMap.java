package collectionR;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMap {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> data= new HashMap<Integer,String>();
		
		System.out.println("Enter the n: ");
		n= sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Roll : ");
			int roll= sc.nextInt();
			System.out.println("Enter the name: ");
			String name= sc.next();
			
			data.put(roll, name);
			
		}
		
		for (Map.Entry<Integer, String> entry : data.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+": "+val);
		}
	}

}
