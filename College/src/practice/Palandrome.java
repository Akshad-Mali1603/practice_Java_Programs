package practice;

public class Palandrome {

	public static void main(String[] args) {
		String arg[] = null;
		if(arg.length == 0) {
			System.out.println("INVALID ARGUMENTS !!!!!");
			
		}else {
			if(args[0].equals(new java.lang.StringBuilder(args[0]).reverse().toString()))
				System.out.println("Palandrome");
			else
				System.out.println("Not palandrome");
	}
	}

}
