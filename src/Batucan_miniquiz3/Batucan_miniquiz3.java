package Batucan_miniquiz3;
import java.util.Scanner;

/*
 * A program where user is to input a (whole) decimal number 
 * and the  number will then be calculated to convert it to 
 * a binary number and it will then be displayed in a correct order.
 * 
 * @author Julia Fe I. Tabaco
 * @date 11.29.2023
 */
public class Batucan_miniquiz3 {
	
	//initialize the counter
	public static int i = 0;
	public static int j = 0;
	
	/**
	 * Allow users to input a decimal number and 
	 * calls the convertDeciToBi() and printBinary() method.
	 * 
	 * @param args An array containing String.
	 * @return No return value.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		//allocate memory of the array where binary value will be stored
		int[] binaryNumber = new int[100];

		System.out.print("Enter a decimal number: ");
		int decimalNumber = in.nextInt();
		
		System.out.println("Decimal number: " + decimalNumber);
		
		//convert the decimal to binary
		convertDeciToBi(binaryNumber, decimalNumber);

		System.out.print("Binary number: ");
		
		//print the binary value in correct order
		printBinary(binaryNumber);

		in.close();
	}
	
	/**
	 * Calculates the remainder of the dN by 2 
	 * and the quotient of the dN by 2. It will loop the 
	 * calculations until dN reaches 0.
	 * 
	 * @param bA An array containing integer.
	 * @param dN An integer value.
	 * @return No return value.
	 *   
	 */
	public static void convertDeciToBi(int[] bA, int dN) {
		for(i = 0; dN > 0; i++) {
		    //calculate and returns the remainder and stores in an array
		    bA[i] = dN % 2; 
		    //calculate and returns the whole number and updates the value
		    dN /= 2;
		}
	}
	
	/**
	 * Prints the binary equivalence of the decimal 
	 * number in correct order using a loop.
	 * 
	 * @param bA An integer value.
	 * @return No return value.
	 */
	public static void printBinary(int [] bA) {
		
		for(j = i-1; j >= 0; j--) {
		    System.out.print(bA[j]);
		}
	}
}