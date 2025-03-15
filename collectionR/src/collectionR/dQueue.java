package collectionR;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class dQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		Queue<Integer> que= new ArrayDeque<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\nInsert   [1]"
					         + "\nDelete   [2]"
					         + "\nPeek     [3]"
					         + "\nisEmpty  [4]"
					         + "\nEXIT     [5]"
					         + "\nEnter the choice: ");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the number: ");
				data=sc.nextInt();
				que.add(data);
				break;
			case 2:
				System.out.println(que.poll());
				break;
			
			case 3:
				System.out.println(que.peek());
				break;
				
			case 4:
				if (que.isEmpty()) {
					System.out.println("Queue is empty");
				}else {
					System.out.println("Queue is not empty !!");
				}
				break;
				
			case 5:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice !!");
				break;
			}
			
		}
	}

}
