import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Book_Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int bid, qty;
				String name, author, address, mob, publication;
				float price, total;

				Connection con = null;
				Statement smt = null;
				PreparedStatement psmt = null;
				ResultSet rs = null;

				try {
					Class.forName("oracle.jdbc.OracleDriver");
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","Akshad16@");
					smt = con.createStatement();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

				Scanner sc = new Scanner(System.in);

				while (true) {
					System.out.println("\n1. Add Book\n2. Display Book" + "\n3. Add Customer" + "\n4. Display Customer"
							+ "\nEXIT" + "Enter a Choice : ");
					int ch = sc.nextInt();

					switch (ch) {
					case 1:
						System.out.println("Enter a Book Details : ");
						System.out.println("Name : ");
						sc.nextLine();
						name = sc.nextLine();
						System.out.println("Author Name : ");
						author = sc.nextLine();
//						System.out.println("Publication name : ");
//						publication = sc.nextLine();
						System.out.println("Qty : ");
						qty = sc.nextInt();
						System.out.println("Price : ");
						price = sc.nextFloat();

						try {
							psmt = con.prepareStatement("Insert into book(name,author,qty,price) values(bid_seq.nextval,?,?,?,?)");
							psmt.setString(1, name);
							psmt.setString(2, author);
//							psmt.setString(3, publication);
							psmt.setInt(3, qty);
							psmt.setFloat(4, price);

							psmt.execute();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						break;
					case 2:
						try {
							rs = smt.executeQuery("Select * from book");
							while(rs.next()) {
     							System.out.print(rs.getInt("bid"));
								System.out.print(rs.getString("name"));
								System.out.print(rs.getString("author"));
//								System.out.print(rs.getString("publication")+" ");
								System.out.print(rs.getInt("qty"));
								System.out.println(rs.getFloat("price"));
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					case 3:
						System.out.println("Enter a Book ID : ");
						bid = sc.nextInt();
						try {
							rs = smt.executeQuery("Select * from book where bid = " + bid);
							if (rs.next()) {
								int availbleQty = rs.getInt("qty");
								System.out.println("Enter a Book Qty : ");
								qty = sc.nextInt();
								if (availbleQty >= qty) {
									System.out.println("Enter a Customer Details : ");
									System.out.println("Name : ");
									sc.nextLine();
									name = sc.nextLine();
									System.out.println("Mobile Number : ");
									mob = sc.next();
									System.out.println("Address : ");
									sc.nextLine();
									address = sc.nextLine();
									psmt = con.prepareStatement("Insert into customer " + "values(cid_seq.nextval1,?,?,?,?,?,?)");
									psmt.setString(1, name);
									psmt.setString(2, mob);
									psmt.setString(3, address);
									psmt.setInt(4, qty);
									psmt.setFloat(5, rs.getFloat("price") * qty);
									psmt.setInt(6, bid);
									psmt.executeUpdate();

									psmt = con.prepareStatement("Update book set qty = ? where bid = ?");
									psmt.setInt(1, availbleQty - qty);
									psmt.setInt(2, bid);
									psmt.executeUpdate();

								} else
									System.out.println("Required Qty is Not available !!!");
							} else
								System.out.println("Book id Not FOUND !!");

						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					default:
						break;
					}

				}

			}

		

	}