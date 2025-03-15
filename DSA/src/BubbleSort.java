import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int n=0,temp=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array: ");
		n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("how many numbers you want to enter:");
		int m=sc.nextInt();
		for (i = 0; i < m; i++) {
			arr[i]=sc.nextInt();
		}
			for (i = 0; i < m; i++) {
				for (int j = 0; j < m-1-i; j++) {
					if (arr[j]>arr[j+1]) {
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;						
					}
				}
			}
		
		System.out.println("After sorting: ");
		for (i = 0; i < m; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
