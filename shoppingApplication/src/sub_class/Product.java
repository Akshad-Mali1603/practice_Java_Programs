package sub_class;

import java.io.File;
import java.io.FileWriter;

public class Product {
	private static int idcount = 901;
	private int id;
	private String name;
	private int qty;
	private float costPrice;
	private float sellingPrice;
	private String vendor;
	private int tempQt;
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int qty, float costPrice, float sellingPrice, String vendor) {
		super();
		this.id = idcount++;
		this.name = name;
		this.qty = qty;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.vendor = vendor;
		this.tempQt=getQty();
	}
	
	public int getTempQt() {
		return tempQt;
	}

	public void setTempQt(int tempQt) {
		this.tempQt = tempQt;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(float costPrice) {
		this.costPrice = costPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public void productsDisplay() {
		System.out.println("\u001B[1;33mProduct ID: " + this.id + "\nProduct Name: " + this.name + "\nCost Price: "
				+ this.costPrice + "\nSelling Price: " + this.sellingPrice + "\nQuantity: " + this.qty
				+ "\nVendor name: " + this.vendor + "\n------------------------------------\u001B[0m");
	}
	
	
}
