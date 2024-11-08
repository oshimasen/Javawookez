package Batucan_L16Activity3;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	/*
	 * Asks the user to enter his choice from the menu
	 * 
	 * @param args holds String array value
	 * 
	 * @return no return value
	 */
	public static void main(String[] args) {

		boolean flag = true;

		System.out.println("Oshi's phonebook\n");
		while (flag) {
			Phonebook.menu();
			System.out.print("\nEnter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				Phonebook.addContact();
				break;
			case 2:
				Phonebook.displayNames();
				break;
			case 3:
				Phonebook.searchContact();
				break;

			}
		}

	}

}
