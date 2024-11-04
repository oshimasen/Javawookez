/**
 * 
 */
package Batucan_L12Activity2;

/**
 * @author jake.batucan
 *
 */
public class DnDGame {

	/*
	 * Instantiate swordsman, catalyst and archer class Displays swordsman, catalyst
	 * and archer's profile Calls battleCharacter function
	 * 
	 * @param args hold String value
	 * 
	 * @return no return value
	 */
	public static void main(String[] args) {
		DnDCharacter swordsman = new Swordsman("Diluc");
		DnDCharacter catalyst = new Catalyst("Klee");
		DnDCharacter archer = new Archer("Amber");

		System.out.println(swordsman.toString("Swordsman"));
		System.out.println("\n" + catalyst.toString("Catalyst"));
		System.out.println("\n" + archer.toString("Archer"));

		battleCharacter(archer, catalyst);
	}

	/*
	 * Displays character name and health Checks if character is alive, apply buff,
	 * restoreHealth, or do attack if true Displays the winner
	 * 
	 * @param char1 holds DnDCharacter value
	 * 
	 * @param char2 holds DnDCharacter value
	 * 
	 * @return no return value
	 */
	public static void battleCharacter(DnDCharacter char1, DnDCharacter char2) {
		System.out.println("\n" + char1.characterName + " health: " + char1.health);
		System.out.println(char2.characterName + " health: " + char2.health);

		while (char1.isAlive() && char2.isAlive()) {

			char1.buffAbility(20);
			char1.attack(char2);

			if (char2.isAlive()) {
				char2.restoreHealth(10);
				char2.attack(char1);
			}
			System.out.println("\n" + char1.characterName + " health: " + char1.health);
			System.out.println(char2.characterName + " health: " + char2.health);
		}
		if (char1.isAlive()) {
			System.out.println("\n" + char1.characterName + " wins the game!");
		} else {
			System.out.println("\n" + char2.characterName + " wins the game!");
		}
	}
}
