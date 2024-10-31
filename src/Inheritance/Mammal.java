package Inheritance;

public class Mammal extends Animal {
	
	private String name;
	
	protected int age;
	
	public int numTails = super.tails;
	
	public String color;
	
	public int eyes = 2;
	
	
	public Mammal(int age, String color, int numLegs) {
		super(numLegs);
		this.age = age;
		this.color = color;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void imoMammal() {
		System.out.println("Imo mama murag mammal");
	}
	public void makeAnime() {
		System.out.println("make anime");
	}
	
}
