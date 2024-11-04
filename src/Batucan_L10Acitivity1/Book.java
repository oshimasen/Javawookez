package Batucan_L10Acitivity1;

import java.time.LocalDate;

public class Book {

	// fields necessary for the program
	LocalDate returnDate;
	LocalDate dueDate;
	private String title;
	private String author;
	private int yearPublished;
	private boolean isRented;

	/*
	 * Initializes the fields
	 * @param title hold the string value
	 * @param author holds the string value
	 * @param yearPublished holds the int value
	 */
	Book(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		isRented = false;
	}

	/*
	 * returns isRented
	 * 
	 * @return  returns boolean value
	 */
	public boolean getIsRented() {
		return isRented;
	}

	/*
	 * Assigns isRented with true value
	 * 
	 * @return no return value
	 */
	public void rent() {
		isRented = true;
	}

	/*
	 * Returns a string value
	 * 
	 * @return returns a string value
	 */
	public String toString() {
		return title + "\t" + author + "\t" + yearPublished;
	}

	/*
	 * Initializes returnDate value
	 * 
	 * @return no return value
	 */
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	/*
	 * Returns a 0.0 value
	 * 
	 * @return returns a boolean value
	 */
	public double calculateFine(LocalDate returnDate2) {

		return 0.0;
	}

	/*
	 * Return an empty string
	 * 
	 * @return returns a string value
	 */
	public String displayDates() {

		return "";
	}
}
