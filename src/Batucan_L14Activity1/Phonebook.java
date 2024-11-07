package Batucan_L14Activity1;

import exception.OutOfBoundDigitsException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Phonebook {
	static Scanner scanner = new Scanner(System.in);
	static int ARRAY_LENGTH = 2;
	static String[] names = new String[ARRAY_LENGTH];
	static long[] phoneNumbers = new long[ARRAY_LENGTH];
	static int counter = 0;

	/*
	 * Asks user to input name and phone number
	 * Display appropriate error message
	 * @param args holds string value
	 * @return no return value
	 */
	public static void main(String[] args) throws InputMismatchException {
		for (int i = 0; i < ARRAY_LENGTH; i++) {
			long inputNumber = 0;
			System.out.print("Input name #" + (i + 1) + " here: ");
			String inputName = scanner.nextLine();
			if (inputName.equals("N/A") || inputName.contentEquals("n/a")) {
				displayNames(names);
				break;
			}

			System.out.print("Input number of name #" + (i + 1) + " here: ");
			try {
				try {
					inputNumber = scanner.nextLong();
					OutOfBoundDigitsException.validateDigits(inputNumber);
					names[i] = inputName;
					phoneNumbers[i] = inputNumber;
					counter++;
					scanner.nextLine();
				}catch (OutOfBoundDigitsException e) {
					System.out.println(e.getMessage());
					i--;
					scanner.nextLine();
				}		

			} catch (InputMismatchException e) {
				System.out.println("\n[ Invalid input! Only whole numbers are allowed ]\n");
				i--;
				scanner.nextLine();
			}

		}
		displayNames(names);

	}
	/*
	 * Display the names in the lists
	 * Asks user to search for a specific name
	 * 
	 * @param names holds array of string
	 * @return no return value
	 */
	public static void displayNames(String[] names) {
		System.out.println("\nContact lists: ");
		for (int i = 0; i < counter; i++) {
			System.out.println("[" + (i + 1) + "] " + names[i]);
		}
		System.out.print("Search contact details of person: ");

		String searchPerson = scanner.nextLine();

		searchContact(searchPerson);
	}
	/*
	 * Searchers through the lists
	 * Display the name and phone number
	 * 
	 * @param searchName holds string value
	 * @return no return value
	 */
	public static void searchContact(String searchName) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(searchName)) {
				System.out.println("\nName: " + searchName);
				System.out.println("Phone Number: " + phoneNumbers[i]);
				return;
			}
		}

	}
}
