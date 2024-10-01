package Activity3;

import java.util.Scanner;

public class Act3 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		double myMoney = 10.50;
		int allPeopleInvited = 5;
		int elevatorCapacity = 5;
		int peopleAttending = 4;
		boolean isWinning = false;
		boolean isFriendHappy = true;
		double price = 2.50;
		String[] questions = { "do I have enough to buy chips?", "can the elevator hold everyone?",
				"will my friend be happy?", "can everyone attend my dinner party?", "will I win the election?" };

		for (int i = 0; i < questions.length; i++) {
			System.out.println("\nHey Java, " + questions[i]);

			if (i == 0) {
				System.out.printf("Java: %s", myMoney > price ? "Yes" : "No");
			} else if (i == 1) {
				System.out.printf("Java: %s", elevatorCapacity > peopleAttending ? "Yes" : "No");
			} else if (i == 2) {
				System.out.printf("Java: %s", isFriendHappy ? "Yes" : "No");
			} else if (i == 3) {
				System.out.printf("Java: %s", allPeopleInvited != peopleAttending ? "No" : "Yes");

			} else if (i == 4) {
				System.out.printf("Java: %s", isWinning ? "Yes" : "No");
			}
		}

	}

}
