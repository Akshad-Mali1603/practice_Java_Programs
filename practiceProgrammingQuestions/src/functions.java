import java.util.Scanner;

public class functions{
		Scanner sc = new Scanner(System.in);
		public void prime() {
			System.out.println("enter number:");
			int n=sc.nextInt();
			int i;
			int flag=1;
			for( i=2;i<n;i++){
			      if(n%i==0)
			        flag =0;
			   
			      }  
			      if(flag==1){
			    	  System.out.println("  prime number");
			      }
			      else
			     System.out.println(" not prime number");
	}
		public void reverse() {
			System.out.println("enter number");
			int n=sc.nextInt();
			int rev=0;
			int rem;
			while (n>0) {
	            rem=n%10;
	            rev=rev*10+rem;
	            n = (n/10);
	            
	        } 
	        System.out.println("reverse number: " +rev);
			
		}
		public void sumofnum() {
			System.out.println("enter number");
			int n=sc.nextInt();
			int rem;
			int sum=0;
			while (n>0) {
	            rem=n%10;
	            sum+=rem;
	            n = (n/10);
	            
	        } 
	        System.out.println("sum of number: " +sum);
			
		}
		public void max() {
			System.out.println("enter number: ");
			int a= sc.nextInt();
			System.out.println("enter number: ");
			int b= sc.nextInt();
			System.out.println("enter number: ");
			int c= sc.nextInt();
			
			a =(a>b && a>c)?a:(b>a && b>c)?b:c;
			System.out.println("Maximum number is: "+a);
		}
		
		
		public void min() {
			System.out.println("enter number: ");
			int a= sc.nextInt();
			System.out.println("enter number: ");
			int b= sc.nextInt();
			System.out.println("enter number: ");
			int c= sc.nextInt();
			
			System.out.println("Min is: "+Math.min(a, Math.min(b,c)));
		}
		
		public void perfect() {
			System.out.println("Enter the number: ");
			int a = sc.nextInt();
			int i, sum=0;
			for(i=1;i<=a/2;i++)
		    {
		        if(a%i==0)
		        {
		            sum += i;
		        }
		        
		    }
		    if(sum == a)
		        {
		           System.out.println("The prfect number is: "+sum);
		        }
		        else
		        {
		           System.out.println("It is not a perfect number");
		        }

		}
}
		

