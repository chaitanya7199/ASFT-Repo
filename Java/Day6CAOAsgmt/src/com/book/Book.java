package com.book;

import java.util.Scanner;

public class Book {
	
	Scanner sc = new Scanner(System.in);
	
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	
	public Book() {}
	
	public Book(String bookId, String title, String author, String category, float price) {
		while(!(bookId.startsWith("B") && bookId.length()==4)) {
				System.out.println("\nBookID should start with 'B' and should be of length 4.");
				System.out.println("Enter correct bookId : ");
				bookId = sc.nextLine();
		}
		this.bookId = bookId;
		
		this.title = title;
		
		this.author = author;
		
		while(!(category.equals("Science") || 
				category.equals("Fiction") || 
				category.equals("Technology") || 
				category.equals("Others"))) {
			System.out.println("\nCategory is wrong.\n"
					+ "Enter from one of the following categories: "
					+ "\nScience\nFiction\nTechnology\nOthers");
		    System.out.println("Enter correct category : ");
		    category = sc.nextLine();
		}
		this.category = category;
		
		while(price < 0) {
			System.out.println("Price cannot be negative.");
			System.out.println("Enter correct price : ");
			price = sc.nextFloat();
		}
		this.price = price;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		while(!(bookId.startsWith("B") && bookId.length()==4)) {
			System.out.println("BookID should start with 'B' and should be of length 4.");
			System.out.println("Enter correct bookId : ");
			bookId = sc.nextLine();
	}
		this.bookId = bookId;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		while(!(category.equals("Science") || 
				category.equals("Fiction") || 
				category.equals("Technology") || 
				category.equals("Others"))) {
			System.out.println("Category is wrong.\n"
					+ "Enter from one of the following categories: "
					+ "\nScience\nFiction\nTechnology\nOthers");
		    System.out.println("Enter correct category : ");
		    category = sc.nextLine();
		}
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		while(price < 0) {
			System.out.println("Price cannot be negative.");
			System.out.println("Enter correct price : ");
			price = sc.nextFloat();
		}
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book:"
				+ "\nBookId = " + bookId 
				+ ", \nTitle = " + title 
				+ ", \nAuthor = " + author 
				+ ", \nCategory=" + category
				+ ", \nPrice=" + price
				+ "\n";
	}
		

}
