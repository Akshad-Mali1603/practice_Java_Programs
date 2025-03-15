package services;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

import sub_class.Product;
import sub_class.Vendor;

public class productServices {
	private ArrayList<Product> pro = new ArrayList<Product>();
	Product product = new Product();
	private venderInfo ve;

	Scanner sc = new Scanner(System.in);

	public productServices(venderInfo ve) {
		// TODO Auto-generated constructor stub
		this.ve = ve;
	}

	public void addProducts() {
		System.out.println("Enter a product name: ");
		String pname = sc.next();
		System.out.println("Enter a product Cost price: ");
		float cprice = sc.nextFloat();
		System.out.println("Enter the Quantity: ");
		int qty = sc.nextInt();
		System.out.println("Enter the product Selling price: ");
		float sprice = sc.nextFloat();
		System.out.println("Enter Vendor ID: ");
		int vid = sc.nextInt();

		if (ve.ven.isEmpty()) {
			System.out.println("\n\u001B[1;31m Please add vendor first !!\u001B[0m");
		} else {
			Optional<String> name = ve.ven.stream().filter(x -> x.getId() == vid).map(Vendor::getName).findFirst();
			if (name.isPresent()) {
				pro.add(new Product(pname, qty, cprice, sprice, name.get()));
				System.out.println("\n\u001B[1;32m Product Added Successfully !!\u001B[0m");
			} else {
				System.out.println("\n\u001B[1;31m No vendor found !!\u001B[0m");
			}
		}
	}

	public void diplayProduct() {
		if (pro.isEmpty()) {
			System.out.println("\n\u001B[1;31m No product found !!\u001B[0m");
		} else {
			System.out.println("\n\u001B[1;32m Available Products!!\u001B[0m");
			for (Product product : pro) {
				product.productsDisplay();
			}
		}

	}

	public void removeProduct() {

		if (pro.isEmpty()) {
			System.out.println("\n\u001B[1;31m No products data available !!\u001B[0m");
		} else {
			System.out.println("Enter a product id: ");
			int pid = sc.nextInt();

			boolean removepro = pro.removeIf(product -> product.getId() == pid);

			System.out.println(removepro ? "\u001B[1;32m Product Successfully Removed !!\u001B[0m"
					: "\u001B[1;31mNo Product Found !!\u001B[0m");
		}

	}

	public Product productSelectById(int id) {
		for (Product product : pro) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null;
	}

	public void displayProductsForCust() {
		if (pro.isEmpty()) {
			System.out.println("\n\u001B[1;31m No product found !!\u001B[0m");
		} else {
			System.out.println("\n\u001B[1;32m Available Products!!\u001B[0m");
			for (Product product : pro) {
				System.out.println("\n\u001B[1;36mProduct ID: " + product.getId() + "\nName: " + product.getName()
						+ "\nPrice: " + product.getSellingPrice() + "\u001B[0m");
			}
		}
	}

}
