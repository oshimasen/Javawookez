package Batucan_Exercise3;

import java.util.Scanner;
import java.util.Arrays;

public class Batucan_Exercise3 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		final int PLANE_CAP = 10;
		String[] classType = { "First Class", "Economy" };
		boolean[] planeCapacity = new boolean[PLANE_CAP];
		int passengerCounter = 0;
		int firstClassCounter = 0;
		int economyClassCounter = 5;
		boolean isNotFull = true;

		Arrays.fill(planeCapacity, false);

		while (isNotFull) {
			System.out.println(Arrays.toString(planeCapacity));
			System.out.println("\n[1] First Class\n[2] Economy");
			System.out.print("Please choose your class: ");
			int inputClass = scanner.nextInt();

			

			switch (inputClass) {
			case 1:
				if (firstClassCounter == 5 && isNotFull) {
					System.out.println("Would you like to transfer to economy? [YES/NO] ");
					String answer = scanner.next();
					if (answer.equalsIgnoreCase("NO")) {
						System.out.println("[ Next flight leaves in 3 hours. ]");
						break;
					} else {
						economyClassCounter++;
						planeCapacity[economyClassCounter] = true;
						economyClassSeat(economyClassCounter, classType[inputClass]);
						break;
					}
				} else {
					planeCapacity[firstClassCounter] = true;
					firstClassCounter++;
					firstClassSeat(firstClassCounter, classType[inputClass - 1]);
					break;
				}

			case 2:
				if (economyClassCounter == 10 && isNotFull) {
					System.out.println("Would you like to transfer to first class? [YES/NO] ");
					String answer = scanner.next().toUpperCase();
					if (answer.equalsIgnoreCase("NO")) {
						System.out.println("[ Next flight leaves in 3 hours. ]");
						break;
					} else {
						planeCapacity[firstClassCounter + 1] = true;
						firstClassCounter++;
						firstClassSeat(firstClassCounter, classType[inputClass - 1]);
						break;
					}
				} else {
					planeCapacity[economyClassCounter] = true;
					economyClassCounter++;
					economyClassSeat(economyClassCounter, classType[inputClass - 1]);
					break;
				}

			default:
				System.out.println("\nInvalid input! Please try again...");
				break;
			}

			passengerCounter++;
			
			if (passengerCounter == 10) {
				System.out.println("\n\n[ All seats are occupied...]");
				isNotFull = false;
			}

		}

	}

	public static void firstClassSeat(int firstClassCounter, String classType) {
		System.out.println("\n---------------------------------");
		System.out.println("|Seat Number: " + firstClassCounter);
		System.out.println("|Class type: " + classType);
		System.out.println("-----------------------------------");
	}

	public static void economyClassSeat(int economyCounter, String classType) {
		System.out.println("\n------------------------------");
		System.out.println("\nSeat Number: " + economyCounter);
		System.out.println("Class type: " + classType);
		System.out.println("--------------------------------");
	}
}
