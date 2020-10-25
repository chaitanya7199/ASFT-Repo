package com.book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.exception.InvalidInputException;

public class BookStore {
	
	HashMap<String,Book> books = new HashMap<String,Book>();
	
	public void addBook(Book book) {
		books.put(book.getBookId(), book);
		System.out.println("\nBook added successfully.\n");
	}
	
	public void searchByTitle(String title) {
		int flag = 0;
		ArrayList<Book> bookDetails = new ArrayList<Book>(books.values());
		//bookDetails.add((Book) books.values());
		for(Book book : bookDetails) {
			if(book.getTitle().equals(title)) {
				System.out.println(book);
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Book(s) with title "+title+" not found.\n");
	}
	
	public void searchByAuthor(String author) {
		int flag = 0;
		ArrayList<Book> bookDetails = new ArrayList<Book>(books.values());
		//bookDetails.add((Book) books.values());
		for(Book book : bookDetails) {
			if(book.getAuthor().equals(author)) {
				System.out.println(book);
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Book(s) with author "+author+" not found.\n");
	}
	
	public void displayAll() {
		if(books.size()==0)
			System.out.println("No books to display.\n");
		
		 //Serialization 
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("books-file"));
			oos.writeObject(books);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Deserialization 
		 ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("books-file"));
			HashMap<String,Book> b = (HashMap<String,Book>) ois.readObject();
			ArrayList<Book> bookDetails = new ArrayList<Book>(b.values());
			for(Book book : bookDetails) {
				System.out.println(book);
			}
			 ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void displayBookById(String bookId) {
		int flag = 0;
		ArrayList<Book> bookDetails = new ArrayList<Book>(books.values());
		//bookDetails.add((Book) );
		for(Book book : bookDetails) {
			if(book.getBookId().equals(bookId)) {
				System.out.println(book);
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Book(s) with bookID "+bookId+" not found.\n");
	}
	
	public void updateBookById(String bookId) {
		Scanner sc = new Scanner(System.in);
		String title, author, category;
		float price;
		int flag = 0;
		int choice = 5;
		ArrayList<Book> bookDetails = new ArrayList<Book>(books.values());
		//bookDetails.add((Book) books.values());
		for(Book book : bookDetails) {
			
			if(book!=null && book.getBookId().equals(bookId)) {
				
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
						book.setTitle(title);
						books.put(bookId, book);
						System.out.println("\nDetails Updated.\n");
					}
					
					if(choice==2) {
						System.out.println("Enter new author : ");
						author = sc.nextLine();
						book.setAuthor(author);
						books.put(bookId, book);
						System.out.println("\nDetails Updated.\n");
					}
					
					if(choice==3) {
						System.out.println("Enter the category : ");
						category = sc.next();
						try {
							book.setCategory(category);
							books.put(bookId, book);
							System.out.println("\nDetails Updated.\n");
						} catch (InvalidInputException e) {
							System.out.println(e.getMessage());
						}
					}
					
					if(choice==4) {
						System.out.println("Enter new price : ");
						price = sc.nextFloat();
						try {
							book.setPrice(price);
							books.put(bookId, book);
							System.out.println("\nDetails Updated.\n");
						} catch (InvalidInputException e) {
							System.out.println(e.getMessage());
						}
					}
					sc.close();
			    } while(choice!=5);
			}
		}
		if(flag == 0 && choice!=5)
			System.out.println("Book(s) with bookID "+bookId+" not found.\n");
	}
	
}
