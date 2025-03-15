import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class bankServices {
	
	public void CreateAcc(Connection con, Scanner sc) {
		try {
			System.out.println("Enter a holder name: ");
			String name= sc.nextLine();
			System.out.println("Enter the balanace: ");
			double bal=sc.nextFloat();
			System.out.println("Enter the Email address: ");
			String email = sc.nextLine();
			System.out.println("Enter the mobile number: ");
			String mob=sc.nextLine();
			PreparedStatement psmt= con.prepareStatement("Insert into account(account_holder_name,balance,email,mobile_number)values(?,?,?,?)");
			psmt.setString(1, name);
			psmt.setDouble(2, bal);
			psmt.setString(3, email);
			psmt.setString(4, mob);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void depositMoney(Connection con, Scanner sc) {
        System.out.println("Enter Account Number: ");
        int accNum = sc.nextInt();
        if (!isValidAccount(con, accNum)) {
            System.out.println("Invalid Account Number!");
            return;
        }
        System.out.println("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();
        try {
			PreparedStatement psmt = con.prepareStatement("UPDATE Account SET balance = balance + ? WHERE account_number = ?");
			psmt.setDouble(1, amount);
			psmt.setInt(2, accNum);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			if (e.getSQLState().equals("23514")) {
				System.out.println("Check the account number it is INVALID !!");
			}else {
				e.printStackTrace();
			}
		}

        try {
        	PreparedStatement ts = con.prepareStatement("INSERT INTO Transaction (account_number, deposited_amount, withdrawn_amount, balance_amount, transaction_date) VALUES (?, ?, NULL, (SELECT balance FROM Account WHERE account_number = ?), CURRENT_TIMESTAMP)");
        	ts.setInt(1, accNum);
			ts.setDouble(2, amount);
			ts.setInt(3, accNum);
			ts.executeUpdate();
			
			System.out.println("Amount Deposited Successfully!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	public void withdrawMoney(Connection con,Scanner sc) {
		
		  System.out.println("Enter Account Number: ");
	        int accNum = sc.nextInt();
	        if (!isValidAccount(con, accNum)) {
	            System.out.println("Invalid Account Number!");
	            return;
	        }
	        System.out.println("Enter Amount to Withdraw: ");
	        double amount = sc.nextDouble();
	        try {
				PreparedStatement psmt = con.prepareStatement("UPDATE Account SET balance = balance - ? WHERE account_number = ?");
				psmt.setDouble(1, amount);
				psmt.setInt(2, accNum);
				psmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				if (e.getSQLState().equals("23514")) {
					System.out.println("Check the account number it is INVALID !!");
				}else {
					e.printStackTrace();
				}
			}

	        try {
	        	PreparedStatement ts = con.prepareStatement("INSERT INTO Transaction (account_number, deposited_amount, withdrawn_amount, balance_amount, transaction_date) VALUES (?, null, ?, (SELECT balance FROM Account WHERE account_number = ?), CURRENT_TIMESTAMP)");
	        	ts.setInt(1, accNum);
				ts.setDouble(2, amount);
				ts.setInt(3, accNum);
				ts.executeUpdate();
				
				System.out.println("Amount Withdraw Successfully!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private boolean isValidAccount(Connection con, int accNum){
        try {
        	PreparedStatement psmt = con.prepareStatement("SELECT account_number FROM Account WHERE account_number = ?");
        	psmt.setInt(1, accNum);
			ResultSet rs= psmt.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
    }

}
