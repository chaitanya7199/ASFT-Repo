package com.book;

import java.util.Scanner;

import com.exception.InvalidInputException;

public class BookStore {
	
	Scanner sc = new Scanner(System.in);
	
	Book[] books = new Book[50];
	static int numberOfBooks = 0; 
	
	public void addBook(Book b) {
		if(numberOfBooks == 3) {
			System.out.println("Book Store is filled. Cannot add book.");
			return;
		}
		books[numberOfBooks++] = b;
		System.out.println("\nBook added successfully.\n");
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
		for(int i=0;i<numberOfBooks;i++) {
			if(books[i]!=null)
				System.out.print(books[i]+"\n");
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
		int choice;
		for(Book b : books) {
			
			if(b!=null && b.getBookId().equals(bookId)) {
				
				do {				
					System.out.println("Enter the field you want to update from the following :\n"
							         + "1. Title\n"
							         + "2. Author\n"
							         + "3. Category\n"
							         + "4. Price\n"
							         + "5. Exit\n");
					choice = sc.nextInt();
					sc.nextLine();
					if(choice==1) {
						System.out.println("\nEnter new title : ");
						title = sc.nextLine();
						b.setTitle(title);
						System.out.println("\nDetails Updated.\n");
					}
					
					if(choice==2) {
						System.out.println("Enter new author : ");
						author = sc.nextLine();
						b.setAuthor(author);
						System.out.println("\nDetails Updated.\n");
					}
					
					if(choice==3) {
						System.out.println("Enter the category : ");
						category = sc.next();
						try {
							b.setCategory(category);
							System.out.println("\nDetails Updated.\n");
						} catch (InvalidInputException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
					}
					
					if(choice==4) {
						System.out.println("Enter new price : ");
						price = sc.nextFloat();
						try {
							b.setPrice(price);
							System.out.println("\nDetails Updated.\n");
						} catch (InvalidInputException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
					}
			    } while(choice!=5);
			}
		}
		if(flag == 0)
			System.out.println("Book(s) with bookID "+bookId+" not found.\n");
	}
	
}
