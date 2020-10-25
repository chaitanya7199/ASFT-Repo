package com.bookutil;

import java.util.Scanner;

import com.book.*;

public class BookUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BookStore bs = new BookStore();
		
		int choice;
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. Add 3 books to book store.\n"
					         + "2. Search book by title.\n"
					         + "3. Search book by author.\n"
					         + "4. Display book by Id\n"
					         + "5. Display all books details.\n"
					         + "6. Update the details of a book.\n"
					         + "0. Exit");
			choice = sc.nextInt();
		
			if(choice == 1) {
				String bookId, title, author, category;
				float price;
				for(int i=0;i<3;i++) {
					System.out.print("\nEnter the details of the book"+(i+1)+" : \nEnter bookId : ");
					bookId = sc.next();
					sc.nextLine();
					System.out.print("Enter title : ");
					title = sc.nextLine();
					System.out.print("Enter author : ");
					author = sc.nextLine();
					System.out.print("Enter category : ");
					category = sc.next();
					System.out.print("Enter price : ");
					price = sc.nextFloat();
					Book b = new Book(bookId, title, author, category, price);
					bs.addBook(b);
				}
			}
			
			else if(choice == 2) {
				String title;
				System.out.println("\nEnter the title : ");
				sc.nextLine();
				title = sc.nextLine();
				bs.searchByTitle(title);
			}
			
			else if(choice == 3) {
				String author;
				System.out.println("\nEnter the author name : ");
				sc.nextLine();
				author = sc.nextLine();
				bs.searchByAuthor(author);
			}
			
			else if(choice == 4) {
				String bookId;
				System.out.println("\nEnter the bookId : ");
				sc.nextLine();
				bookId = sc.nextLine();
				bs.displayBookById(bookId);
			}
			
			else if(choice == 5) {
				bs.displayAll();
			}
			
			else if(choice == 6) {
				System.out.println("\nEnter the bookId you want to update : ");
				sc.nextLine();
				String bookId = sc.nextLine();
				bs.updateBookById(bookId);
			}
		} while(choice!=0);
		
		sc.close();
		
	}

}
