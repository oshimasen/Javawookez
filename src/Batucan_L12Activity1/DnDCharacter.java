package Batucan_L12Activity1;

public abstract class DnDCharacter {
	public String characterName;
	public int health;
	public int damage;
	
	public abstract void attack(DnDCharacter opponent);
	public abstract void receiveDamage(int damage);
	/*
	 * Return character, character name, health and damage as string
	 * 
	 * @param character holds string value
	 * @return String value
	 */
	public String toString(String character) {
		return character + "'s Profile: \n "+ "Name: " +characterName + "\tHealth: " + health +"\tDamage: "+ damage;
	}
	/*
	 * Return true if health is greater than zero otherwise return false
	 * 
	 * @return boolean value
	 */
	public boolean isAlive() {
		if(health > 0)
			return true;
		
		return false;
	}
	
}
