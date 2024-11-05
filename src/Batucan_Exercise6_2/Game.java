package Batucan_Exercise6_2;

public abstract class Game {
	private String name;

	public abstract void start();

	/*
	 * A constructor for Game class Initializes the name
	 * 
	 * @param name holds string value
	 */
	public Game(String name) {
		this.name = name;
	}

	/*
	 * A getter function for name
	 * 
	 * @return string name value
	 */
	public String getName() {
		return name;
	}

}
