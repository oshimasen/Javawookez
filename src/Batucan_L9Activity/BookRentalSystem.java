package Batucan_L9Activity;

public class BookRentalSystem {

	/*
	 * Initializes the rentalItems
	 */
	static Book[] rentalItems = { new FictionBook("The Lord of the Rings", "J.R.R Tolkien", 1954),
			new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960),
			new NonFictionBook("The Tipping Point", "M.  Gladwell", 2000),
			new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997) };

	/*
	 * The main function that class displayBooks and rentedBooks method
	 * 
	 * @return no return value
	 */
	public static void main(String[] args) {

		displayBooks(rentalItems);
		rentedBooks();
	}

	/*
	 * Displays the books
	 * @param rentalItems hold the value Book
	 * 
	 * @returns no return value
	 */
	public static void displayBooks(Book[] rentalItems) {
		System.out.println("****************** LIBRARY *******************");
		for (int i = 0; i < rentalItems.length; i++) {
			System.out.println(rentalItems[i]);
		}
	}

	/*
	 * Initializes the  rentalItems at index 0 and 2 with rent function
	 * Displays the rented books
	 * 
	 * @return no return value
	 */
	public static void rentedBooks() {

		rentalItems[0].rent();
		rentalItems[2].rent();
		System.out.println("\n********* BOOKS RENTED, NEVER READ ***************");

		for (Book rented : rentalItems) {
			if (rented.getIsRented())	
				System.out.println(rented);
		}
	}
}
