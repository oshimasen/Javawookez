package Batucan_L11Activity1;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookRentalSystem {

	/*
	 * Initializes the rentalItems
	 */
	static Book[] rentalItems = { new FictionBook("The Lord of the Rings", "J.R.R Tolkien", 1954),
			new FictionBook("To  a Mockingbird", "Harper Lee", 1960),
			new NonFictionBook("The Tipping Point", "M.  Gladwell", 2000),
			new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997) };

	static File f = new File("D:\\ACTION\\Java exercises\\Javawookez\\Library.txt");

	/*
	 * The main function that calls writeToFile, readFromFile and rentedBooks method
	 * 
	 * @return no return value
	 */
	public static void main(String[] args) {

		writeToFile();
		readFromFile();
		rentedBooks();
	}

	/*
	 * Displays the books
	 * 
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
	 * Initializes the rentalItems at index 0 and 2 with rent function Displays the
	 * rented books
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

	/*
	 * writes/stores object to Library.txt catches IOException error
	 * 
	 * @return no return value
	 */
	public static void writeToFile() {

		try {
			FileOutputStream file = new FileOutputStream(f);
			ObjectOutputStream obj = new ObjectOutputStream(file);
			
			obj.writeObject(rentalItems);
			obj.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*
	 * Displays the object from the Library.txt Catches exception and
	 * classnotfoundexception error
	 * 
	 * @return no return value
	 */
	public static void readFromFile() {

		try {
			FileInputStream fileStream = new FileInputStream(f);
			ObjectInputStream objStream = new ObjectInputStream(fileStream);
			Book[] books = (Book[]) objStream.readObject();
			
			System.out.println("****************** LIBRARY *******************");
			for (Book b : books) {
				System.out.println(b);
			}
			objStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
