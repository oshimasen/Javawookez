package Batucan_Exercise6_2;

import java.util.Scanner;

public class Hangman extends Game implements Playable {
	private String secretWord;
	private StringBuilder currentGuess;
	private int attemptsLeft;
	private boolean gameOver;

	/*
	 * Calls the super constructor and initializes the parameter with the name of
	 * the game. Initializes the field secretWord in an uppercase String value of
	 * the constructorÅfs parameter. Instantiate currentGuess with the StringBuilder
	 * class. Initializes currentGuess with Åg_Åh using append() function by putting
	 * it inside a loop that checks if the counter i is less than the length of
	 * secretWord. Initializes attemptsLeft to 6 Initializes gameOver to the default
	 * value of its data type.
	 * 
	 * @param secretWord holds string value
	 */
	public Hangman(String secretWord) {
		super("Zoo");
		this.secretWord = secretWord.toUpperCase();
		this.currentGuess = new StringBuilder();
		for (int i = 0; i < secretWord.length(); i++) {
			currentGuess.append('_');
		}
		this.attemptsLeft = 6;
		this.gameOver = false;
	}

	/*
	 * Prints the label ÅgWelcome to <the name of the game>Åh and "Guess the word.
	 * Invokes play()
	 * 
	 * return no return value
	 */
	public void start() {
		System.out.println("Welcome to the " + getName());
		System.out.println("Guess the word " + currentGuess);
		play();
	}

	/*
	 * Asks the user to input a single letter in uppercase and initializes it in a
	 * variable named char_guess. Check currentGuess if it still contains the
	 * character Åg_Åh, thus, it will print ÅgCongratulations! You've guessed the
	 * word.Åh and initializes gameOver to true. Check if attempts left are 0, it
	 * will print ÅgGame over! The word was: Åg and prints the secretWord and
	 * initializes gameOver to true.
	 * 
	 * return no return value
	 */
	public void play() {
		Scanner scanner = new Scanner(System.in);

		while (!gameOver) {
			System.out.println("\nCurrent guess " + currentGuess);
			System.out.print("\nPlease input a letter [CAPITAL ONLY]: ");
			String guess = scanner.next().toUpperCase();
			char char_guess = guess.charAt(0);
			try {

				if (!Character.isLetter(char_guess)) {
					throw new RuntimeException("\n[ Input is not a letter! ]");
				}
				if (guess.length() > 1) {
					throw new RuntimeException("\n[ Input too long! ]");
				}

				if (secretWord.contains(Character.toString(char_guess))) {
					System.out.println("\nCorrect guess!");
					System.out.println("Attempts left: " + attemptsLeft);
					updateCurrentGuess(char_guess);
				} else {
					System.out.println("\nIncorrect guess!");
					attemptsLeft--;
					System.out.println("Attempts left: " + attemptsLeft);
				}

				if (currentGuess.toString().contains("_") == false) {
					System.out.println("Congratulations! You've guessed the word " + secretWord);
					gameOver = true;
				}
				if (attemptsLeft == 0) {
					System.out.println("Game over! the word was " + secretWord);
					gameOver = true;
				}

			} catch (RuntimeException re) {
				System.out.println(re.getMessage());

			}

		}

		scanner.close();
	}

	/*
	 * Checks if secretWord at a certain index is equal to guess. If yes, then using
	 * currentGuess it will set the guess character to a specified index using the
	 * function setCharAt().
	 * 
	 * @param guess holds the char value
	 * 
	 * @return no return value
	 */
	public void updateCurrentGuess(char guess) {
		for (int i = 0; i < secretWord.length(); i++) {
			if (secretWord.charAt(i) == guess) {
				currentGuess.setCharAt(i, guess);
			}
		}
	}

}
