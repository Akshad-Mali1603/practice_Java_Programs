import java.util.Scanner;

public class Operationmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Operation obj = new Operation();
		
		System.out.println("Enter the numbers: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		obj.addData(n1, n2);
		obj.subData(n1, n2);
		obj.mulData(n1, n2);
		obj.divData(n1, n2);
		
		sc.close();
		
	}

}
