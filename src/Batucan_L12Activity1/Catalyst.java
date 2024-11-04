package Batucan_L12Activity1;

public class Catalyst extends DnDCharacter {
	/*
	 * Initializes the fields
	 * 
	 * @param characterName holds String value
	 */ 
	Catalyst(String characterName) {
		super(characterName, 100, 15);
	}
	/*
	 * Displays character name and buff damage and attack
	 * Calls receiveDamage method of opponent
	 * 
	 * @param opponent holds DnDCharacter value
	 * @return no return value
	 */
	 public void attack(DnDCharacter opponent){
		 System.out.println(characterName + " tightly binded " + opponent.characterName);
		 opponent.receiveDamage(damage);
	}
	 /*
	 * Calculate/update the health of the character depending on the given damage.
	 * @param damage holds int value
	 * @return no return value
	 */	 
	 public void receiveDamage(int damage) {
		 health = health - damage;
	}
}
