//Pseudo code

//---------------------
// 1. asking for menu choice
// 2. identifyin entity class with proper attributes
// 3. options
//--------add book
//--------1. ask user for number of books
//--------2. create array of book object
//--------3. ask for all information from user
//--------4. create object with new keyword
//--------5. insert into array by calling custructor
//--------------------------------------------------
//--------Search for book
//--------1. linear search
//------------------------reaplce even position character with next character
//--------Sort book by 
//--------using buuble sort
//--------------------------------------------------
//--------Updating Number of copies

package Library;

import java.util.Scanner;

public class MainDrier {

	static Scanner sc = new Scanner(System.in);

	static Book[] books;
	static int numberOfBooks = 0;

	public static void main(String[] args) {

		boolean flag = true;
		byte choice = 0;
		do {
			displayOptions();

			System.out.println("Enter your choice");
			choice = sc.nextByte();
			switch (choice) {
			case 1:
				System.out.println("Enter number of books");
				numberOfBooks += sc.nextInt();
				books = addBooks();

				System.out.println("*********************************************************");
				for (int i = 0; i < books.length; i++) {
					display(books[i]);
				}
				System.out.println("*********************************************************");
				break;
			case 2:
				Book book = searchByBookName();

				System.out.println("*********************************************************");
				display(book);
				System.out.println("*********************************************************");
				break;
			case 3:
				books = sortByAuthor(books);
				System.out.println("*********************************************************");
				for (int i = 0; i < books.length; i++) {
					display(books[i]);
				}
				System.out.println("*********************************************************");
				break;
			case 4:
				books = updateNumberOfCopies();
				System.out.println("*********************************************************");
				for (int i = 0; i < books.length; i++) {
					display(books[i]);
				}
				System.out.println("*********************************************************");
				break;
			case 5:
				flag = false;
				System.out.println("You are exited from the application");

			}

		} while (flag);

	}

	public void copyArray(){
		
	}

	private static Book[] updateNumberOfCopies() {
		sc.nextLine();
		System.out.println("Enter book name to update number of copies");
		String name = sc.nextLine();

		for (int i = 0; i < books.length; i++) {
			if ((books[i].getName()).compareTo(name) == 0) {
				System.out.println("Enter new number of copies");
				long newNumberOfCopies = sc.nextLong();

				books[i].setNumberOfCopies(newNumberOfCopies);
			}
		}
		return books;
	}

	private static Book[] sortByAuthor(Book[] books) {
		// sorting with bubble sort
		Book temp = null;
		for (int i = 0; i < books.length; i++) {
			for (int j = i + 1; j < books.length; j++) {
				if ((books[i].getAuthor()).compareToIgnoreCase(books[j].getAuthor()) > 0) {
					temp = books[i];
					books[i] = books[j];
					books[j] = temp;
				}
			}
		}
		return books;
	}

	private static Book searchByBookName() {
		sc.nextLine();
		System.out.println("Enter Book name");
		String name = sc.nextLine();

		Book searchedBook = null;

		for (int i = 0; i < books.length; i++) {
			if (books[i].getName().compareTo(name) == 0) {
				String replacedName = replaceName(name);
				books[i].setName(replacedName);

				searchedBook = books[i];

			}
		}
		return searchedBook;
	}

	private static String replaceName(String name) {
		String replacedname = "";

		for (int i = 0; i < name.length(); i++) {
			char character = name.charAt(i);
			if (i % 2 != 0) {
				character = (char) (character + 1);
				character = (char) (character - 32);
			}
			replacedname += character;
		}

		return replacedname;
	}

	private static void display(Book books2) {

		System.out.println("Name of the book:		" + books2.getName());
		System.out.println("Publisher of the book:	" + books2.getPublisher());
		System.out.println("Author of thr book:		" + books2.getAuthor());
		System.out.println("Nomber of copies:		" + books2.getNumberOfCopies() + " copies");
		System.out.println("-------------------------------------------------------------------------");

	}

	private static Book[] addBooks() {

		books = new Book[1];

		for (int i = 0; i < numberOfBooks; i++) {
			System.out.println("Enter Name of the book");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter Publisher of the book");
			String publisher = sc.nextLine();
			System.out.println("Enter Author f the book");
			String author = sc.nextLine();
			System.out.println("Enter Number of copies");
			long numberOfCopies = sc.nextLong();

			// creating object and calling cunstructor(parameterized);
			books[i] = new Book(name, publisher, author, numberOfCopies);
		}
		return books;
	}

	private static void displayOptions() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("1. Add books");
		System.out.println("2. Search for an book");
		System.out.println("3. Sort by an Autor");
		System.out.println("4. Update number of copies");
		System.out.println("5. Exit");
		System.out.println("--------------------------------------------------------------");
	}
}
