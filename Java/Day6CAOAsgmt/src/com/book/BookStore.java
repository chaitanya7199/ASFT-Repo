package com.book;

import java.util.Scanner;

public class BookStore {
	
	Scanner sc = new Scanner(System.in);
	
	Book[] books = new Book[3];
	static int numberOfBooks = 0; 
	
	public void addBook(Book b) {
		if(numberOfBooks == 3) {
			System.out.println("Book Store is filled. Cannot add book.");
			return;
		}
		books[numberOfBooks++] = b;
		System.out.println("Book added successfully.\n");
	}
	
	public void searchByTitle(String title) {
		int flag = 0;
		for(Book b : books) {
			if(b!=null && b.getTitle().equals(title)) {
				System.out.println(b);
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Book(s) with title "+title+" not found.\n");
	}
	
	public void searchByAuthor(String author) {
		int flag = 0;
		for(Book b : books) {
			if(b!=null && b.getAuthor().equals(author)) {
				System.out.println(b);
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Book(s) with author "+author+" not found.\n");
	}
	
	public void displayAll() {
		int count = 0;
		if(books.length == 0)
			System.out.println("No books to display.\n");
		for(Book b : books) {
			if(!(b==null))
				System.out.print(b+"\n");
			    count++;
			}
		if(count == 0) 
			System.out.println("No books to display.\n");
	}
	
	public void displayBookById(String bookId) {
		int flag = 0;
		for(Book b : books) {
			if(b!=null && b.getBookId().equals(bookId)) {
				System.out.println(b);
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Book(s) with bookID "+bookId+" not found.\n");
	}
	
	public void updateBookById(String bookId) {
		String title, author, category;
		float price;
		int flag = 0;
		for(Book b : books) {
			
			if(b!=null && b.getBookId().equals(bookId)) {
				
				System.out.println("\nEnter new title : ");
				title = sc.nextLine();
				b.setTitle(title);
				
				System.out.println("Enter new author : ");
				author = sc.nextLine();
				b.setAuthor(author);
				
				System.out.println("Enter the category : ");
				category = sc.next();
				b.setCategory(category);
				
				System.out.println("Enter new price : ");
				price = sc.nextFloat();
				b.setPrice(price);
				
				System.out.println("Details Updated.\n");
				
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Book(s) with bookID "+bookId+" not found.\n");
	}
	
}
