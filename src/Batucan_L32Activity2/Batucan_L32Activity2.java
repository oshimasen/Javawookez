package Batucan_L32Activity2;

import java.util.Scanner;

public class Batucan_L32Activity2 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String day;

		System.out.print("Hey, Are you free on ");
		day = scanner.nextLine().toLowerCase();

		switch (day) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "friday":
			System.out.println("No. Sorry I have work that day.");
			break;
		case "thursday":
			System.out.println("No. I have a coffee appointment on Thursday.");
			break;
		case "saturday":
		case "sunday":
			System.out.println("Of course! It's a weekend.");
			break;
		default:
			System.out.println("No such day exist :(");
		}
	}
}
