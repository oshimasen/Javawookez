package Batucan_L15Activity1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	/*
	 * Asks the user to choose an operator for the calculation Display the result of
	 * the calculation
	 * 
	 * @param args holds the String array value
	 * 
	 * @return no return value
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("0.00");
		GenericsCalculator<Float> calc = new GenericsCalculator<Float>(11.5f, 30.0f);
		boolean flag = true;

		System.out.println("1st Number: " + calc.getNum_1());
		System.out.println("2nd Number: " + calc.getNum_2());

		while (flag) {
			System.out.println(
					"\n[A] Addition" + "\n[B] Subtraction" + "\n[C] Multiplication" + "\n[D] Division" + "\n[E] Exit");
			System.out.print("Operation: ");
			char operation = scanner.next().toLowerCase().charAt(0);
			switch (operation) {	
			case 'a':
				System.out.println(
						calc.getNum_1() + " + " + calc.getNum_2() + " = " + numberFormat.format(calc.addition()));

				break;
			case 'b':
				System.out.println(
						calc.getNum_1() + " - " + calc.getNum_2() + " = " + numberFormat.format(calc.subtraction()));
				break;
			case 'c':
				System.out.println(
						calc.getNum_1() + " * " + calc.getNum_2() + " = " + numberFormat.format(calc.multiplication()));
				break;
			case 'd':
				System.out.println(
						calc.getNum_1() + " / " + calc.getNum_2() + " = " + numberFormat.format(calc.division()));
				break;
			case 'e':
				System.out.println("\nThank you for using our calculator...");
				flag = false;
				break;
			default:
				System.out.println("\nKindly choose from the menu");
			}
		}
		scanner.close();
	}
}
