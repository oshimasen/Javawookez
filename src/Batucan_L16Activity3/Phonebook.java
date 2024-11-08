package Batucan_L16Activity3;

import exception.OutOfBoundDigitsException;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Phonebook {
	static Scanner scanner = new Scanner(System.in);
	static HashMap<String, Long> contact = new HashMap<>();

	static int counter = 0;

	public static void displayNames() {
		System.out.println("\nContact lists: ");
		for (String name : contact.keySet()) {
			System.out.println("+ " + name);
		}
	}

	/*
	 * Searchers through the lists Display the name and phone number
	 * 
	 * @param searchName holds string value
	 * 
	 * @return no return value
	 */
	public static void searchContact() {
		System.out.print("Search a name: ");
		String nameInput = scanner.nextLine();

		for (String name : contact.keySet()) {
			if (name.contains(nameInput)) {
				System.out.println("Name: " + nameInput);
				System.out.println("Phone number: " + contact.get(name));
			} else {
				System.out.println("Cannot find contact...");
			}

		}

	}

	/*
	 * Display the menu options
	 * 
	 * @return no return value
	 */
	public static void menu() {
		System.out.println("\n[1]. Add Contact\n[2]. Display Contacts\n[3]. Search Contact\n[4]. Close Program");
	}

	/*
	 * Asks user to input name and number Checks if the number is valid Displays
	 * appropriate error message
	 */
	public static void addContact() {
		System.out.print("Input name here: ");
		String name = scanner.nextLine();
		System.out.print("Input number of " + name + " here: ");

		try {
			try {
				long number = scanner.nextLong();
				OutOfBoundDigitsException.validateDigits(number);
				contact.put(name, number);
				counter++;
				scanner.nextLine();
			} catch (OutOfBoundDigitsException e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}

		} catch (InputMismatchException e) {
			System.out.println("\n[ Invalid input! Only whole numbers are allowed ]\n");
			scanner.nextLine();
		}

	}
}
