package services;

import java.util.ArrayList;

import sub_class.Cart;
import sub_class.Payment;
import sub_class.Product;

public class cartServices {

	private ArrayList<Cart> cart = new ArrayList<Cart>();
	
	public void addToCart(Product product, int quantity) {
		if (product.getTempQt()<quantity) {
			System.out.println("\n\u001B[1;31mNot enough stock available !!\u001B[0m");
			
		}else {
			cart.add(new Cart(product, quantity));
			product.setTempQt(product.getTempQt()-quantity);
			System.out.println("\n\u001B[1;32mProduct added to cart successfully!\u001B[0m");
		}
		
	}

	public void displayCart() {
		if (cart.isEmpty()) {
			System.out.println("\u001B[1;31mYour cart is empty!\u001B[0m");
		} else {
			System.out.println("\u001B[1;34mYour Shopping Cart:\u001B[0m");
			float allTotal = 0;
			System.out.println("===============================================");
			System.out.printf("%-10s|%-15s|%-8s|%-10s%n", "Product ID", "Product name", "Quantity", "Price");
			System.out.println("===============================================");
			for (Cart item : cart) {
				item.displayCartItems();
				allTotal += item.getTotalPrice();
			}
			System.out.println("===============================================");
			System.out.printf("Total amount : ₹%.2f%n",allTotal);
			System.out.printf("Tax(10%%) is : ₹%.2f%n",(allTotal * 0.1));
			System.out.printf("The Total Amount to pay (with Tax) : ₹%.2f%n",(allTotal + (allTotal * 0.1)));
			System.out.println("===============================================");
		}
	}
	
	 public void removeProductFromCart(int rpid) {
	        if (cart.isEmpty()) {
	            System.out.println("\u001B[1;31mCart is empty !! Nothing to remove\u001B[0m");
	            return;
	        }

	        boolean removed = false;
	        for (int i=0; i<cart.size(); i++) {
	        	
	            Cart item = cart.get(i);
	            if (item.getProduct().getId() == rpid) {
	                cart.remove(i);
	                item.getProduct().setTempQt(item.getProduct().getTempQt()+item.getCqty());
	                removed = true;
	                System.out.println("\u001B[1;32mProduct removed from cart successfully !!\u001B[0m");
	                break;
	            }
	        }

	        if(!removed) {
	            System.out.println("\u001B[1;31mProduct not found in cart !!\u001B[0m");
	        }
	    }
	 
	 public void checkOutPayment() {
		 Payment payment = new Payment();
		 if (cart.isEmpty()) {
	            System.out.println("\u001B[1;31mCart is empty !! Add products before checkout.\u001B[0m");
	            return;
	        }
	        displayCart();
	        float allTotal=0;
	        for (Cart item : cart) {
				allTotal += item.getTotalPrice();
			}
	        boolean paymentSuccess = payment.processPayment(allTotal);
	        if (paymentSuccess) {
	        	for (Cart item : cart) {
					item.getProduct().setQty(item.getProduct().getQty()-item.getCqty());
				}
	            cart.clear();
	            System.out.println("\u001B[1;32mPayment successful! Thank you for shopping !!\u001B[0m");
	        } else {
	            System.out.println("\u001B[1;31mPayment failed! Try again !!\u001B[0m");
	        }
	}

}
