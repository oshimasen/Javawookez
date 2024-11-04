package Batucan_L12Activity1;

public class Archer extends DnDCharacter {

	/*
	 * Initializes the fields
	 * 
	 * @param characterName holds String value
	 */ 
	Archer(String characterName){
		this.characterName = characterName;
		this.health = 100;
		this.damage = 20;
	}
	/*
	 * Displays character name and buff damage and attack
	 * Calls receiveDamage method of opponent
	 * 
	 * @param opponent holds DnDCharacter value
	 * @return no return value
	 */
	 public void attack(DnDCharacter opponent){
		 System.out.println(characterName + " sharply shoots " + opponent.characterName);
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
