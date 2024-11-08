package Batucan_L16Activity1;

import java.time.LocalDate;
import java.util.ArrayList;

public class BookRentalSystem {

	/*
	 * Initializes the library
	 */
	static ArrayList<Book> library = new ArrayList<>();

	/*
	 * The main function that class displayBooks and rentedBooks method
	 * 
	 * @return no return value
	 */
	public static void main(String[] args) {

		displayBooks(library);
		rentedBooks();
	}

	/*
	 * Displays the books
	 * 
	 * @param library2 hold the value Book
	 * 
	 * @returns no return value
	 */
	public static void displayBooks(ArrayList<Book> library2) {
		addBooks();
		System.out.println("****************** LIBRARY *******************");
		for (int i = 0; i < library2.size(); i++) {
			System.out.println(library2.get(i));
		}
	}

	/*
	 * Initializes the library at index 0 and 2 with rent function Displays the
	 * rented books with the return, due date and fine
	 * 
	 * @return no return value
	 */
	public static void rentedBooks() {

		library.get(0).rent();
		library.get(2).rent();

		library.get(0).setReturnDate(LocalDate.of(2024, 11, 26));
		library.get(2).setReturnDate(LocalDate.of(2024, 11, 16));

		System.out.println("\n********* BOOKS RENTED, NEVER READ ***************");

		for (Book rented : library) {
			if (rented.getIsRented()) {
				System.out.println(rented + rented.displayDates());
			}
		}

	}

	/*
	 * Stores the books in the ArrayList library
	 * 
	 * @return no return value
	 */
	public static void addBooks() {
		library.add(new FictionBook("The Lord of the Rings", "J.R.R Tolkien", 1954));
		library.add(new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960));
		library.add(new NonFictionBook("The Tipping Point", "M.  Gladwell", 2000));
		library.add(new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997));
	}
}
