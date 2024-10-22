package Batucan_Lesson6Activity;

public class Batucan_Lesson6Activity {
	
	/**
	 * Inside the function:
	 * 1. loops 6 times
	 * 2. calls the printLines() function inside the loop
	 * 
	 * @param args an array of String
	 * @return no return value
	 */
	public static void main(String[]args) {
		
		for(int i=0; i<6;i++) {
			printLines();
		}
	}
	/**
	 * Inside the function:
	 * 	1. prints the four lines
	 * 
	 * @return no return value
	 * */
	public static void printLines() {
		System.out.println("I will not copy and paste code.");
		System.out.println("I will use Camel case when writing class names.");
		System.out.println("I will use lower Camel case when writing function names.");
		System.out.println("I will use lower Camel case when writing variable names.\n");
	}
}
