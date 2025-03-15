package Assignment;

import java.util.Scanner;

public class BookManager {

	
public static Book[] createBooks(int n) {
    Scanner sc = new Scanner(System.in);
    Book[] books = new Book[n];

    for (int i = 0; i < n; i++) {
        System.out.println("Enter details for Book " + (i + 1) + ":");
        System.out.print("Enter title: ");
        String title = sc.next();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        books[i] = new Book(title, price);
    }
    sc.close();
	return books;
    
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of books: ");
	int n = sc.nextInt();
	
	Book[] books = createBooks(n);
	
	sc.close();

	System.out.println("Display the books Information");
    System.out.printf("Book Title \t\tPrice\n");
    for (int i = 0; i < n; i++) {
        
        books[i].showbooks();
    
}
}
}