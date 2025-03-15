import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		
		
		Connection con = null;
		Statement smt = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		bankServices bs= new bankServices();
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://dpg-cuvfe95ds78s73ckvsi0-a.oregon-postgres.render.com:5432/employee_ogy6","employee_ogy6_user","8U9SKIU5CLm3fIOM1FbqC69AKCMhPsWN");
			smt = con.createStatement();
			smt.execute("create table if not exists Account ("
				    +"account_number serial primary key,"
				    +"account_holder_name varchar(255) not null,"
				    +"balance decimal(10,2) check(balance >= 5000),"
				    +"email varchar(255) not null check (email ~ '^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z]{2,}$'),"
				    +"mobile_number varchar(10) not null check(mobile_number ~ '^[0-9]{10}$')"
				    + ")");	
			
			while (true) {
                System.out.println("\n1. Create Account\n2. Deposit Money\n3. Withdraw Money\n4. Show Account Details\n5. Show Transaction History\n6. Delete Account\n7. Exit\nEnter your choice: ");
                int choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                        bs.CreateAcc(con, sc);
                        break;
                    case 2:
                    	bs.depositMoney(con, sc);
                        break;
                    case 3:
                        bs.withdrawMoney(con, sc);
                        break;
                    case 4:
                        showAccountDetails(con, sc);
                        break;
                    case 5:
                        showTransactionHistory(con, sc);
                        break;
                    case 6:
                        deleteAccount(con, sc);
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        con.close();
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
