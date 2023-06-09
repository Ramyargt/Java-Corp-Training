package com.rgt.training.session2Basics;

import java.util.Scanner;

public class SimpleLibraryManage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Library library = new Library();
		int choice;

		do {
			System.out.println("Welcome to Simple Library Management: ");
			System.out.println("1.Add Book ");
			System.out.println("2.Add Patron ");
			System.out.println("3.Borrow Book ");
			System.out.println("4.Return Book ");
			System.out.println("5.Book Availability ");
			System.out.println("6.Borrowed books by Patrons ");
			System.out.println("7.Exit ");
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Book Title");
				String BookTitle = scanner.next();
				System.out.println("Enter Book author name");
				String BookAuthor = scanner.next();
				library.addBook(BookTitle);
				break;

			case 2:
				System.out.println("Enter Patron name");
				String PatronName = scanner.next();
				library.addPatron(PatronName);
				break;

			case 3:
				System.out.println("Enter Patron name");
				PatronName = scanner.next();
				System.out.println("Enter Book Title");
				String Booktitle = scanner.next();
				library.borrowBook(Booktitle);
				break;

			case 4:
				System.out.println("Enter Patron name");
				PatronName = scanner.next();
				System.out.println("Enter book title to return ");
				String bookreturn=scanner.next();
				library.returnbook(bookreturn);
				break;

			case 5:
				System.out.println("Total Books available are " + library.bookAvailability);
				break;

			case 6:
				System.out.println("Total Borrowed books count is: "+library.bookBorrowCount);
				break;

			case 7:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		} while (choice < 7);
	}
}

class Library {

	final int MAX_BOOKS = 20;
	final int MAX_PATRONS = 10;

	String[] BookTitles=new String[MAX_BOOKS];
	String[] Patronnames = new String[MAX_PATRONS];

	int patroncount = 0;
	int bookAvailability=0;
	int bookBorrowCount=0;

	public void addBook(String Booktitle) {
		
		if (bookAvailability < MAX_BOOKS) {
			BookTitles[bookAvailability]=Booktitle;
			System.out.println("New Book added Successfull---");
			bookAvailability++;
			System.out.println("Total books after adding new Books is " + bookAvailability);
		}
	else if(bookAvailability> MAX_BOOKS){
			System.out.println("Book storage is overflow ---------");
		}
	}

	public void addPatron(String patron) {
		patroncount++;
		if (patroncount <= MAX_PATRONS) {
			Patronnames[patroncount] = patron;
			System.out.println("New Patron added Successfull---");
			System.out.println("Total ptrons added are " + patroncount);
		} else if (patroncount > MAX_PATRONS) {
			System.out.println("Patron storage is overflow ---------");
		}
	}

	public void borrowBook(String booktitle) {
		if(booktitle!=null) {
		for(String singlebooktitle:BookTitles ) {
		if(booktitle.equalsIgnoreCase(singlebooktitle)) {
			bookBorrowCount++;
			bookAvailability--;
			System.out.println("Book borrowed successfull---------");
			System.out.println("Total books borrowed is " + bookBorrowCount);
			}
		}
		}
		else {
				System.out.println("Books are not available to borrow----");
			}
		}
		
	public void returnbook(String bookreturned) {
		bookAvailability++;
		bookBorrowCount--;
		BookTitles[bookAvailability] = bookreturned;
		System.out.println("Book returned successfull------------");
		System.out.println("Total available books after return is "+bookAvailability);
	}
	
}
