package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {
	//driver load
	
			//connection establish
			//statement create 
			//execute query
	public void createTable() {
	}

	public void createData() {
		
		
		// 
		
	}

	public void readData() {
		try {
			String url = "jdbc:mysql://localhost:3306/AB";
			String username = "root";
			String password = "Akshad1603@";
			
			Connection conn = DriverManager.getConnection(url,username,password);
			Statement stm = conn.createStatement();
			
		    String query = 'INSERT into student(sid, sname, semail) values(1,"Akshad","akshadmali16@gmail.com")';
		    
		    stm.execute(query);
		    System.out.println("Table created succesfully");
		    conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	  
		// TODO Auto-generated method stub
		
	}
	
}
