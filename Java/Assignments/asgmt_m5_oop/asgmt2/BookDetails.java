package asgmt2;

import java.util.Scanner;

class Book {
	
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	public Book() {}
	
	public Book(int bookNo, String title, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getBookNo() {
		return bookNo;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}	
	
}

class EngineeringBook extends Book {
	
	private String category;
	
	public EngineeringBook() {}	

	public EngineeringBook(int bookNo, String title, String author, float price, String category) {
		super(bookNo, title, author, price);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book book1 = new Book();
		
		System.out.print("Enter book ID : ");
		int bookNo = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter book title : ");
		String title = sc.nextLine();
		
		System.out.print("Enter book author : ");
		String author = sc.nextLine();
		
		System.out.print("Enter book price : ");
		float price = sc.nextFloat();
		
		book1.setBookNo(bookNo);
		book1.setTitle(title);
		book1.setAuthor(author);
		book1.setPrice(price);
		
		EngineeringBook book2 = new EngineeringBook(bookNo, title, author, price, "CS");
		System.out.println("BookNumber : "+book2.getBookNo()+"\nBookTitle  : "+book2.getTitle()+
				"\nBookAuthor : "+book2.getAuthor()+"\nBookPrice  : "+book2.getPrice()+
				"\nBookCategory : "+book2.getCategory());
		
		sc.close();
	}

}
