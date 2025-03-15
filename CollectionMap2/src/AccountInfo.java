import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AccountInfo {

	public Map<String, Account> create(){
		Account acc1 = new Account(101,"Ganesh",10000);
		Account acc2 = new Account(11,"Mahesh",5000);
		Account acc3 = new Account(111,"Amit",15000);
		Account acc4 = new Account(151,"Ajay",20000);
		Account acc5 = new Account(1,"Ram",6000);
		Account acc6 = new Account(1,"Ram",6000);
		
		Map<String, Account> accmap=new HashMap<String,Account>();
		
		accmap.put("c001", acc1);
		accmap.put("c006", acc2);
		accmap.put("c004", acc3);
		accmap.put("c009", acc4);
		accmap.put("c002", acc5);
		accmap.put("c003", acc6);
		return accmap;
	}
	
	public static void display(Map<String, Account> accmap1) {
		Set<String> keyset= accmap1.keySet();
		System.out.println(keyset);
		for (String k : keyset) {
			Account acc= accmap1.get(k);
			System.out.println(acc.getAccNumber()+"\t"+acc.getCustName()+"\t"+acc.getAccBal());
		}
	}
}
