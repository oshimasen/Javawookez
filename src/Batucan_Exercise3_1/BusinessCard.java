package Batucan_Exercise3_1;

import java.util.Scanner;

public class BusinessCard {

	static final int NEWCUSTOMERDISCOUNT = 15;
	static final int LOYALTYDISCOUNT = 10;
	static final int COUPONDISCOUNT = 20;
	static long startTime = 0;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to Opening Card! ");
		System.out.println("Are you a new customer? [Y/N]: ");
		char answer = scanner.next().charAt(0);

		switch (answer) {
		case 'y':
		case 'Y':
			System.out.println("Do you have coupon? [Y/N]: ");
			char couponAnswer = scanner.next().toUpperCase().charAt(0);
			
			int total = couponAnswer == 'Y' ? calculate(0, COUPONDISCOUNT) : calculate(NEWCUSTOMERDISCOUNT, 0);
			
			System.out.println("\nYour discount is: " + total + "%");
			break;
		case 'n':
		case 'N':

			System.out.println("Do you have loyalty card? [Y/N]: ");
			char loyalAnswer = scanner.next().charAt(0);
			System.out.println("Do you have coupon? [Y/N]: ");
			char coupon = scanner.next().charAt(0);

			loyalty(loyalAnswer, coupon);
			break;

		default:
			System.out.println("\nINVALID ANSWER!");
		}
		
		long endTime = System.nanoTime();
		System.out.println("Program took " + (endTime - startTime) + " nanoseconds");

	}

	public static int calculate(int customerStatus, int coupon) {

		startTime = System.nanoTime();
		return customerStatus + coupon;
	}

	public static void loyalty(char loyal, char coupon) {

		boolean isLoyal = (loyal == 'Y' || loyal == 'y');
		boolean isCoupon = (coupon == 'Y' || coupon == 'y');

		if (isLoyal && isCoupon) {
			System.out.println("\nYour discount is: " + calculate(LOYALTYDISCOUNT, COUPONDISCOUNT) + "%");
		} else if (isLoyal && !isCoupon) {
			System.out.println("\nYour discount is: " + calculate(LOYALTYDISCOUNT, 0) + "%");
		} else if (!isLoyal && isCoupon) {
			System.out.println("\nYour discount is: " + calculate(0, COUPONDISCOUNT) + "%");
		} else {
			System.out.println("\nYour discount is: " + calculate(0, 0) + "%");
		}
	}

}
