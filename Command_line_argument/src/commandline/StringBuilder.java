package commandline;

public class StringBuilder {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("INVALID ARGUMENTS !!!!!");
			
		}else {
			if(args[0].equals(new java.lang.StringBuilder(args[0]).reverse().toString()))
				System.out.println("Palandrome");
			else
				System.out.println("Not palandrome");
	}
	}

}