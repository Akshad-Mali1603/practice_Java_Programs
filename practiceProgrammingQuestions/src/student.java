import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the record: ");
		int n=sc.nextInt();
		
		test t[] = new test[n];
		
		
		for(int i=0;i<t.length;i++){
		t[i]=new test();
		System.out.println("Enter the roll no: ");
		t[i].roll=sc.nextInt();
		System.out.println("Enter the name: ");
		t[i].name=sc.next();
		System.out.println("Enter the Marks: ");
		t[i].marks=sc.nextFloat();
		}
		
		for(test Test:t) {
		System.out.println("The student roll no is: "+Test.roll);
		System.out.println("Student name is: "+Test.name);
		System.out.println("Marks are: "+Test.marks);
		}
		
		sc.close();
	}

}
