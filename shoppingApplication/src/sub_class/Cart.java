package sub_class;

import java.io.File;
import java.io.FileWriter;

public class Cart {

	private Product product;
	private int cqty;
	private float totalPrice;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(Product product, int cqty) {
		super();
		this.product = product;
		this.cqty = cqty;
		calculateTotal();
	}

	public Product getProduct() {
		return product;
	}

	public int getCqty() {
		return cqty;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	private void calculateTotal() {
		this.totalPrice = (float) (product.getSellingPrice() * cqty);

	}

	public void displayCartItems() {

		System.out.printf("%-10d|%-15s|%-8d|%-10.2f%n", product.getId(), product.getName(), this.cqty, this.totalPrice);
	}
	
	
		
}
