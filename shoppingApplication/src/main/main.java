package main;

import java.util.Scanner;

import services.cartServices;
import services.customerService;
import services.productServices;
import services.venderInfo;
import sub_class.Admin;
import sub_class.Customer;
import sub_class.Product;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Admin admin = new Admin();
		Customer cust = new Customer();
		customerService cu = new customerService();
		venderInfo vns = new venderInfo();
		productServices prod = new productServices(vns);
		cartServices cart = new cartServices();
		while (true) {
			boolean a = true;
			System.out.println("\nPlease select an action-->\n" + "\nAdministration Access:    [1]"
					+ "\nCoustomer Access:         [2]" + "\nCreate Customer Account:  [3]"
					+ "\nClose                 	  [4]\n" + "\nPlease Enter your choice (1/2/3/4): ");
			int ch = sc.nextInt();
			if (ch == 4) {
				System.exit(0);
			} else if (ch > 4) {
				System.out.println("\n\u001B[1;31mInvalid Choice !!\u001B[0m");
			} else if (ch <= 0) {
				System.out.println("\n\u001B[1;31mInvalid Choice !!\u001B[0m");
			} else {
				while (a) {

					switch (ch) {
					case 1:

						System.out.println("Enter the Email: ");
						String ademail = sc.next();
						System.out.println("Enter the Password: ");
						String adpass = sc.next();

						if (ademail.equals(admin.getEmail()) && adpass.equals(admin.getPassword())) {

							System.out.println("You have successfully Login !!\n");
							boolean adl = true;

							while (adl) {
								System.out.println("\n\u001B[1;35mAdmin Options:" + "\n--------------------------------"
										+ "\nDisplay All Customers  [1]" + "\nAdd Vendor Details     [2]"
										+ "\nDisplay All Vendors    [3]" + "\nDelete Vendor          [4]"
										+ "\nAdd Product            [5]" + "\nDisplay Products       [6]"
										+ "\nDelete Product         [7]" + "\nClose Administrator    [8]"
										+ "\nPlease enter your choice: \u001B[0m");
								int ach = sc.nextInt();

								switch (ach) {
								case 1:

									cu.display();
									break;

								case 2:
									vns.addVender();
									break;

								case 3:
									vns.displayVendor();
									break;

								case 4:
									vns.removeVendor();
									break;

								case 5:
									prod.addProducts();
									break;

								case 6:
									prod.diplayProduct();
									break;

								case 7:
									prod.removeProduct();
									break;

								case 8:
									adl = false;
									break;
								default:
									System.out.println("Invalid Choice adl!!");
									break;
								}
							}
							a = false;
							break;
						} else {
							System.out.println("Invalid Detail try Again");
							a = false;
							break;
						}

					case 2:
						if (cu.customerlogin()) {
							boolean cl = true;
							while (cl) {
								System.out.println("\n\u001B[1;35mCustomer options: "
										+ "\nView products                [1]" + "\nAdd to Cart                  [2]"
										+ "\nView Cart                    [3]" + "\nRemove product from Cart     [4]"
										+ "\nProcessing to Pay            [5]" + "\nExit Customer Login          [6]"
										+ "\nEnter the choice: \u001B[0m");

								int cuch = sc.nextInt();

								switch (cuch) {

								case 1:

									prod.displayProductsForCust();
									break;

								case 2:

									System.out.println("Enter product id to Add to Cart: ");
									int pid = sc.nextInt();
									System.out.println("Enter Quantity you wnat to Buy: ");
									int qty = sc.nextInt();

									Product selectProduct = prod.productSelectById(pid);
									if (selectProduct != null) {
										cart.addToCart(selectProduct, qty);
									} else {
										System.out.println("u001B[1;31mProduct not found!\u001B[0m");
									}

									break;

								case 3:
									cart.displayCart();
									break;

								case 4:
									System.out.println("Enter product Id to remove: ");
									int rpid = sc.nextInt();
									cart.removeProductFromCart(rpid);
									break;

								case 5:
									cart.checkOutPayment();
									break;

								case 6:
									cl = false;
									break;

								default:
									System.out.println("u001B[1;31mInvalid Choice !!\u001B[0m");
									break;
								}
							}
						}
						a = false;
						break;

					case 3:
						cu.create();
						a = false;
						break;

					default:
						System.out.println("Invalid Choice !!");
						break;
					}
				}
			}
		}
	}

}
