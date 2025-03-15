package commandline;

public class DemoCMD {

	public static void main(String[] args) {
		
		if(args.length == 2) {
			int a,b;
			a= Integer.parseInt(args[0]);
			b= Integer.parseInt(args[1]);
			
			System.out.println("Addition: "+(a+b));
			
		}else System.out.println("INVALID ARGUMENTS !!!!!");
	}

}
