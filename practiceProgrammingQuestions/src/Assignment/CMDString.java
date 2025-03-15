package Assignment;

public class CMDString {

	public static void main(String[] args) {
		if(args.length > 0) {
		System.out.println("String Length : "+args[0].length());
		if(new StringBuffer(args[0]).reverse().toString().compareTo(args[0])==0)
			System.out.println("Palindrome !!!");
		System.out.println("Upper Case : "+args[0].toUpperCase());
		}else 
			System.out.println("Enter Command Line Arguments !!!");
	}
}
