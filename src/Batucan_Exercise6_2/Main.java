package Batucan_Exercise6_2;

public class Main {
	/*
	 * Initializes the Hangman constructor with String gbananah as the secretWord
	 * and invokes the start().
	 * 
	 * @param args holds string value
	 * 
	 * @return no return value
	 */
	public static void main(String[] args) {
		Game hangman = new Hangman("banana");

		hangman.start();
	}
}
