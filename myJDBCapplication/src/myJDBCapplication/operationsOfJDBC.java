package myJDBCapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class operationsOfJDBC {

	Scanner sc = new Scanner(System.in);

	public void createTable() {

		try (Connection con = JDBCConnection.getConnection("Akshad16@")) {
			con.setAutoCommit(false);

			System.out.println("Enter the table name: ");
			String tablename = sc.nextLine();

			System.out.println("How many columns you want to enter: ");
			int num = Integer.parseInt(sc.nextLine());

			List<String> columnStatements = new ArrayList<>();

			for (int i = 0; i < num; i++) {

				System.out.println("Enter the column name: ");
				String colname = sc.nextLine().trim().replace(" ", "_");

				System.out.println("Choose data types: ");
				List<String> datatypes = Arrays.asList("VARCHAR2(100)", "NUMBER", "DATE", "CHAR(1)", "FLOAT");

				for (int j = 0; j < datatypes.size(); j++) {

					System.out.println((j + 1) + ". " + datatypes.get(j));

				}
				int typeChoice = Integer.parseInt(sc.nextLine());
				String dataType = datatypes.get(typeChoice - 1);

				System.out.println("Choose constraints (optional): ");

				List<String> constraints = Arrays.asList("PRIMARY KEY", "NOT NULL", "UNIQUE", "CHECK ("+colname+" > 0)",
						"NONE");

				for (int k = 0; k < constraints.size(); k++) {

					System.out.println((k + 1) + ". " + constraints.get(k));

				}
				int constraintChoice = Integer.parseInt(sc.nextLine());
				String Constraint = constraints.get(constraintChoice - 1);

				if (Constraint.equals("NONE")) {

					Constraint = "";
				}
				String columnStatement = colname + " " + dataType + " " + Constraint;
				columnStatements.add(columnStatement);
			}

			String createTableSQL = "CREATE TABLE " + tablename + "("
					+ columnStatements.stream().collect(Collectors.joining(", ")) + ")";

			System.out.println("\n Executing SQL : " + createTableSQL);

			try (Statement smt = con.createStatement()) {

				smt.executeUpdate(createTableSQL);
				con.commit();
				System.out.println("Table '" + tablename + "' Created Successfully !!");

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void DisplayTables() {
		String sql = "SELECT table_name FROM user_tables " +
                "WHERE table_name NOT LIKE 'AQ$_%' " +
                "AND table_name NOT LIKE 'DEF$_%' " +
                "AND table_name NOT LIKE 'LOGMNR%' " +
                "AND table_name NOT LIKE 'LOGSTDBY$%' " +
                "AND table_name NOT LIKE 'MVIEW$_%' " +
                "AND table_name NOT LIKE 'REPCAT$_%' " +
                "AND table_name NOT LIKE 'SQLPLUS_%' " +
                "AND table_name NOT LIKE 'OL$%' " +
                "AND table_name NOT LIKE 'HELP' " +
                "ORDER BY table_name";
		try (Connection con= JDBCConnection.getConnection("Akshad16@");
			Statement stm= con.createStatement();
			ResultSet rs= stm.executeQuery(sql)){
			
			System.out.println("\nAvailable Tables Belows: ");
			List<String> Tables= new ArrayList<>();
			
			while (rs.next()) {
			   Tables.add(rs.getString("table_name"));
			}
			if (Tables.isEmpty()) {
				System.out.println("No tables found in the database !!");
			}else {
				Tables.forEach(System.out::println);
			}
				
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void InsertRecord() {
		System.out.println("Insert record in which table write table name: ");
		String tablename= sc.nextLine();
		
		
	}
}
