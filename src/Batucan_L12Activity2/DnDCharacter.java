package Batucan_L12Activity2;

public abstract class DnDCharacter implements Abilities {

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
		return character + "'s Profile: \n " + "Name: " + characterName + "\tHealth: " + health + "\tDamage: " + damage;
	}
	/*
	 * Return true if health is greater than zero otherwise return false
	 * 
	 * @return boolean value
	 */
	public boolean isAlive() {
		if (health > 0)
			return true;

		return false;
	}
	/*
	 * Increases health depending on the restore
	 * @param restore holds int value
	 * @return no return value
	 */
	public void restoreHealth(int restore) {
		health += restore;
	}
	/*
	 * Increases damage depending on the buff
	 * @param buff holds int value
	 * @return no return value
	 */
	public void buffAbility(int buff) {
		damage += buff;
	}

}
