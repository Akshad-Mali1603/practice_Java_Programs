package Constructor;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id, pages;
		String name, author, company;
		float price;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of book records insert: ");
		int n = sc.nextInt();

		Book b[] = new Book[n];

		for (int i = 0; i < b.length; i++) {
			b[i] = new Book();
			System.out.println("Book: " + (i + 1));
			System.out.println("Enter the book ID: ");
			id = sc.nextInt();
			System.out.println("Enter the book Name: ");
			name = sc.next();
			System.out.println("Enter the book Author name: ");
			author = sc.next();
			System.out.println("Enter the book Comapny Name: ");
			company = sc.next();
			System.out.println("Enter the book pages: ");
			pages = sc.nextInt();
			System.out.println("Enter the book Price: ");
			price = sc.nextFloat();
			b[i] = new Book(id, pages, author, company, name, price);
		}
		for (Book x:b) {
			x.display();
		}
		sc.close();

	}

}
