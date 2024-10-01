package Batucan_Exercise1;

import java.util.Scanner;

public class Batucan_Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x, y, z;
		int result;

		System.out.println("Enter your 1st number: ");
		x = scanner.nextInt();
		System.out.println("Enter your 2nd number: ");
		y = scanner.nextInt();
		System.out.println("Enter your 3rd number: ");
		z = scanner.nextInt();

		result = x * y * z;
		System.out.printf("Product is %d", result);

		scanner.close();
	}

	/*
	 * 2.EVALUATION a. x = 2 b. Value of 2 + 2 is 4 c. x = d. 5 = 5
	 * 
	 * 3.MULTIPLE CHOICE d
	 * 
	 * 4.MULTIPLE CHOICE e
	 * 
	 * 5.APPLICATION
	 * 
	 * a. first multiply 3 and 6 and then divide the product then add 7 and minus 1.
	 * the answer in my heart is 15 b. multiply the 2 and 2, divide the other 2 and
	 * 2 then subract the product and quotient of the two then modulu it by 2. the
	 * answer in my heart is 3 c. start at the inner part of the parenthesis. so
	 * multiply 9 and 3 then divide by 3, next add it by 3. then multiply 3 and 9
	 * and their product is also multiplied by the sum in the parenthesis. the anwer
	 * in my heart is 324
	 */
}
