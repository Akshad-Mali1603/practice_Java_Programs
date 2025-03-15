package Constructor;

public class Book {
	
	private int id ,pages;
	private String name,author,company;
	private float price;

	public Book(int id, int pages, String name, String author, String company, float price) {
		super();
		this.id = id;
		this.pages = pages;
		this.name = name;
		this.author = author;
		this.company = company;
		this.price = price;
	}
	
		public Book() {
		// TODO Auto-generated constructor stub
	}

		public void display() {
			System.out.println("ID: "+this.id);
			System.out.println("Name :"+this.name);
			System.out.println("Author : "+this.author);
			System.out.println("Company : "+this.company);
			System.out.println("Pages : "+this.pages);
			System.out.println("Price : "+this.price);
			
		}
}
