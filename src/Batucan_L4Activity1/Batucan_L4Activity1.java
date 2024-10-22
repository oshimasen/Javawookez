package Batucan_L4Activity1;

import java.util.Scanner;

public class Batucan_L4Activity1 {
	static Scanner scanner = new Scanner(System.in);
	static int ARRAY_LENGTH = 5;
	static String[] names = new String[ARRAY_LENGTH];
	static String[] phoneNumbers = new String[ARRAY_LENGTH];
	static int counter = 0;

	public static void main(String[] args) {

		for (int i = 1; i <= ARRAY_LENGTH; i++) {
			System.out.print("Input name #" + i + " here: ");
			String inputName = scanner.nextLine();
			
			if (inputName.equals("N/A") || inputName.contentEquals("n/a")) {
				displayNames(names);
				return;
			}
			names[i - 1] = inputName;
			System.out.print("Input number of name #" + i + " here: ");
			String inputNumber = scanner.nextLine();
			phoneNumbers[i - 1] = inputNumber;
			counter++;

		}
		displayNames(names);

	}

	public static void displayNames(String[] names) {
		System.out.println("\nContact lists: ");
		for (int i = 1; i <= counter; i++) {
			System.out.println("[" + i + "] " + names[i - 1]);
		}
		System.out.print("Search contact details of person: ");
		String searchPerson = scanner.nextLine();

		searchContact(searchPerson);
	}

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
