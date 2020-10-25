package com.book;

import java.io.Serializable;
import java.util.Scanner;

import com.exception.InvalidInputException;

public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8355422877296281430L;
	
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	
	public Book() {}
	
	public Book(String bookId, String title, String author, String category, float price) 
			throws InvalidInputException {
		if(!(bookId.startsWith("B") && bookId.length() == 4)) {
				throw new InvalidInputException("\nBookID should start with 'B' and should be of length 4."
						                      + "\n\nTry Again!!!\n");
		}
		this.bookId = bookId;
		
		this.title = title;
		
		this.author = author;
		
		if(!(category.equals("Science") || 
				category.equals("Fiction") || 
				category.equals("Technology") || 
				category.equals("Others"))) {
			throw new InvalidInputException("\nCategory is wrong.\n"
					+ "Enter from one of the following categories: "
					+ "\nScience\nFiction\nTechnology\nOthers\n\nTry Again!!!\n");
		}
		this.category = category;
		
		if(price < 0) {
			throw new InvalidInputException("Price cannot be negative.\n\nTry Again!!!\n");
		}
		this.price = price;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) throws InvalidInputException {
		if(!(bookId.startsWith("B") && bookId.length()==4)) {
			throw new InvalidInputException("\nBookID should start with 'B' and should be of length 4."
					                      + "\n\nTry Again!!!\n");
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

	public void setCategory(String category) throws InvalidInputException {
		if(!(category.equals("Science") || 
				category.equals("Fiction") || 
				category.equals("Technology") || 
				category.equals("Others"))) {
			throw new InvalidInputException("\nCategory is wrong.\n"
					+ "Enter from one of the following categories: "
					+ "\nScience\nFiction\nTechnology\nOthers\n\nTry Again!!!\n");
		}
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) throws InvalidInputException {
		if(price < 0) {
			throw new InvalidInputException("Price cannot be negative.\n\nTry Again!!!\n");
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