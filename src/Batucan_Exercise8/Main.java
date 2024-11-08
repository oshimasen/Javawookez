package Batucan_Exercise8;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		String[] days =	{"sunday","monday"};//,"tuesday","wednesday","thursday","friday","saturday"
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String[]> recorder = new HashMap<>();
		
		for(String day : days) {
			System.out.print("Enter the weather for "+day.toUpperCase()+ ": ");
			String weather = scanner.nextLine();
			System.out.print("Ether the temperature for "+day.toUpperCase()+ ": ");
			double temp = scanner.nextDouble();
			scanner.nextLine();
			recorder.put(day, {weather, temp});
		}
		System.out.print("Enter a day to check its weather and temperature: ");
		String inputDay = scanner.nextLine();
		for(String day: days) {
			int counter = 0;
			if(day.equalsIgnoreCase(inputDay))
//				System.out.println(recorder.);
			counter++;
		}
		
		scanner.close();
	}
	
}
