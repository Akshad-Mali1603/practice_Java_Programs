import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("\nGiven data\n");
		for(int i : a) {
			System.out.println(i);
		}
		sc.close();
	}

}
