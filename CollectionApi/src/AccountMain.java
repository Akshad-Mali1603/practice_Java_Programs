import java.util.ArrayList;
import java.util.List;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account	acc1 = new Account(101,"Akshad",10000);
		Account acc2 = new Account(102,"Raj",20000);
		Account acc3 = new Account(103,"Harshal",30000);
		Account acc4 = new Account(104,"Vivek",50000);

		List<Account> lst=new ArrayList<Account>();
		
		lst.add(acc1);
		lst.add(acc2);
		lst.add(acc3);
		lst.add(acc4);
		System.out.println("-------------------------------------------------------------");
		display(lst);

		
	}
	public static void display(List<Account>lst) {
		for (Account acc : lst) {
			System.out.println(acc.getAccNumber()+"\t"+acc.getCustName()+"\t"+acc.getAccBal());
			
		}
	}

}
