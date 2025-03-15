import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AccountMap {

	public static void main(String[] args) {
		
		AccountInfo accinfo = new AccountInfo();
		Map<String, Account> accmap1 = accinfo.create();
		accinfo.display(accmap1);
				
	}
	
}
