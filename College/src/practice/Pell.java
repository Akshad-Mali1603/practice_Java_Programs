package practice;

public class Pell {

	public static void main(String[] args) {
		int n=15,num1=0,num2=1;
		System.out.println(num1+"\n"+num2);
		for (int i = 0; i < n;i++) {
			int sum=num1+num2*2;
			num1=num2;
			num2=sum;
			System.out.println(sum);
		}
		
		
	}

}
//write a program to accept the string from the user and trends all palendrome words from the string and also print the word with the second heighest length