package Batucan_Exercise7;

import java.util.Scanner;

public class NutritionalInformation {
	/*
	 * Instantiate the info with Information class
	 * 
	 * @param args holds array of string value
	 * 
	 * @return no return value
	 */
	public static void main(String[] args) {
		NutritionalInformation.Information info = new NutritionalInformation().new Information();
		info.displayNutrition();

	}

	
	class Information {
		/*
		 * Ask the user to input apple, banana or orange Displays the calories and
		 * vitamins
		 * 
		 * 
		 * @return no return value
		 */
		public void displayNutrition() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a fruit name (Apple, Banana, Orange): ");
			try {
				String fruit = scanner.next().toUpperCase();

				System.out.println("\nNutritional Information for " + fruit.toLowerCase() + ":\n"
						+ Nutrients.valueOf(fruit).calories + "\n" + Nutrients.valueOf(fruit).vitamins);
			} catch (IllegalArgumentException e) {
				System.out.println("\nError: Invalid fruit name entered.");
			}
			scanner.close();
		}
	}

	enum Nutrients {
		APPLE("Calories: 95", "Vitamin C: 7.9 mg"), BANANA("Calories: 105", "Vitamin C: 9.1 mg"),
		ORANGE("Calories: 63", "Vitamin C: 53.2 mg");

		public String calories, vitamins;

		/*
		 * A constructor that initializes the calories and vitamins
		 * 
		 * @param calories holds string value
		 * 
		 * @param vitamins holds string value
		 */
		Nutrients(String calories, String vitamins) {
			this.calories = calories;
			this.vitamins = vitamins;
		}
	}
}
