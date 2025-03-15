package commandline;

public class forloop {

	public static void main(String[] args) {
				
				if(args.length == 0) {
					System.out.println("INVALID ARGUMENTS !!!!!");
					
				}else {
					int sum=0;
					for (int i = 0; i < args.length; i++) {
						sum += Integer.parseInt(args[i]);
						
					}System.out.println("Addition: "+sum);
				}
					
			}

		}



