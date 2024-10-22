package Batucan_L32Activity3;

import java.util.Scanner;

public class Batucan_L32Activity3 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		char options;
		String[] bag = { "Master ball", "Pokeball", "Escape Rope", "Shards" };
		String[] stats = { "Trainer's ID: 696969", "Trainer's Name: Oshi", "Money: 69000", "Pokedex: 69" };
		boolean isIngame = true;
		while (isIngame) {
			menu();
			
			System.out.print("Enter option here: ");
			options = scanner.next().charAt(0);
			
			switch (options) {
			case 'a':
			case 'A':
				for (String displayBag : bag) {
					System.out.println("- " + displayBag);
				}
				break;
			case 'b':
			case 'B':
				for (String displayStats : stats)
					System.out.println(displayStats);
				break;
			case 'c':
			case 'C':
				System.out.println("Game play saved!");
				break;
			case 'd':
			case 'D':
				System.out.println("Exit game...");
				isIngame = false;
				break;
			default:
				System.out.println("Invalid option! Enter again.");
			}
		}

	}

	public static void menu() {
		System.out.println("[A] BAG\n[B] STATS\n[C] Save\n[D] EXIT");
	}
}
