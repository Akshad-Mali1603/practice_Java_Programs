package services;

import java.util.ArrayList;
import java.util.Scanner;

import sub_class.Vendor;

public class venderInfo {

	public ArrayList<Vendor> ven = new ArrayList<Vendor>();
	Vendor newvn = new Vendor();
	Scanner sc = new Scanner(System.in);

	public void addVender() {

		System.out.println("Enter the Vender name: ");
		String vname = sc.next();
		System.out.println("Enter the vender email: ");
		String vemail = sc.next();
		System.out.println("Enter Vender address: ");
		String vaddress = sc.next();

		newvn = new Vendor(vname, vemail, vaddress);
		ven.add(newvn);

		System.out.println("\u001B[1;32m Vendor added successfully !!\u001B[0m " + newvn.getId());
	}

	public void displayVendor() {
		if (ven.isEmpty()) {
			System.out.println("\u001B[1;31mNo Vendor Found !!\u001B[0m");
		} else {
			System.out.println("\n\u001B[1;34mVendors List Below-->");
			for (Vendor vendor : ven) {
				vendor.vendorDisplay();
			}
			System.out.println("\u001B[0m");
		}
	}

	public void removeVendor() {
		if (ven.isEmpty()) {
			System.out.println("\u001B[1;31mNo Vendor Found !!\u001B[0m");
		} else {
			System.out.println("Enter the id of vendor which you want to remove: ");
			int id = sc.nextInt();

			boolean remove = ven.removeIf(vendor -> vendor.getId() == id);

			System.out.println(remove ? "\u001B[1;32mVendor removed successfuly !!\u001B[0m"
					: "\u001B[1;31mInvalid Vendor ID!!\u001B[0m");

		}
	}
}
