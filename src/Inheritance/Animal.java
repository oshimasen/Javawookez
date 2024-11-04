package Inheritance;

public class Animal {
	
	
	
	private String type;
	
	public int numLegs;
	
	public int tails = 2;
	
	public Animal(int numLegs) {
		this.numLegs = numLegs;
	}
	
	public void setType(String t) {
		type = t;
	}
	
	public String getType() {
		return type;
	}
	public void sayHello() {
		System.out.println("hello");
	}

	public static void main(String[]args) {
//		Animal p = new Monkey();
//		Monkey m = (Monkey)p;
//		Monkey monkey = new Monkey();
		
		
//		monkey.setDetails();
//		
//		monkey.setFavoriteFood("banana");
//		
//		System.out.println("Favorite food is " + monkey.getFavoriteFood());
//		monkey.imoMammal();
		
//		m.setDetails();
		
		displaySound(new Monkey());
		displaySound(new Bird());
		displaySound(new Elephant());
		displaySound(new Zebra());
	}
	public static void displaySound(Elephant m) {
		System.out.println("What animal that makes a sound ' " + m.makeSound() + " '");
	}
}
