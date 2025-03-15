package services;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Pattern;

import sub_class.Customer;

public class customerService {

	public ArrayList<Customer> cust = new ArrayList<Customer>();

	Customer newCustomer = new Customer();

	public static boolean validateEmail(String email) {
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		return Pattern.matches(regex, email);
	}

	public static boolean validatePassword(String pass) {
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		return Pattern.matches(regex, pass);
	}

	public boolean create() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter username/email: ");
		String email = sc.next();

		if (validateEmail(email)) {

			System.out.println("Set your password: ");
			String pass = sc.next();

			if (validatePassword(pass)) {
				System.out.println("Enter a your name: ");
				String name = sc.next();
				System.out.println("Enter address: ");
				String addr = sc.next();
				newCustomer = new Customer(name, addr, email, pass);
				cust.add(newCustomer);
				System.out.println("\u001B[1;32mCustomer added successfully !!\u001B[0m" + newCustomer.getId());
				return true;
			} else {
				System.out.println("\u001B[1;31mPassword must be at least 8 characters long and includes :" 
						+ "\nUppercase letter"
						+ "\nLowercase letter" 
						+ "\nNumber" 
						+ "\nSpecial character (@$!%*?&)\u001B[0m");
				return false;
			}

		} else {
			System.out.println("\u001B[1;31mInvalid email format! Example: user@example.com\u001B[0m");
			return false;
		}
	}

	public void display() {
		if (cust.isEmpty()) {
			System.out.println("\u001B[1;31mNo customer Found !!\u001B[0m");
		} else {
			System.out.println("\n\u001B[1;34mCustomers List Below-->");
			for (Customer customer : cust) {
				customer.displayCustomer();

			}
			System.out.println("\u001B[0m");
		}
	}

	public boolean customerlogin() {
		Scanner sc = new Scanner(System.in);
		if (cust.isEmpty()) {
			System.out.println("\u001B[1;31mNo record Found !! Please create a new account !!\u001B[0m");
			return false;
		} else {
			System.out.println("Enter username/email: ");
			String user = sc.next();
			System.out.println("Enter password: ");
			String password = sc.next();

			Optional<String> client = cust.stream()
					.filter(customer -> customer.getEmail().equals(user) && customer.getPassword().equals(password))
					.map(Customer::getName).findFirst();

			if (!client.isPresent()) {
				System.out.println("\u001B[1;31mInvalid User and password !! Try again !!\u001B[0m");
				return false;
			} else
				System.out.println("\u001B[1;32mLogin Successfull !!" + client.get() + ""
						+ "\nWelcome to Shopping Application !!\u001B[0m");
			return true;
		}

	}

}
