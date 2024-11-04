package Abstract;

public class  Animal {
	
//	public abstract void makeSound();
//	public abstract void makeNoise();
//	public abstract int calculateNoise();
//	
	public static void main(String[]args) {
//		Animal animal = new Main();
//		
////		Animal.Fish anFish = new Animal().new Fish();
//		Main main = (Main)animal;
//		Mammal mama = (Mammal)animal;
//		Pappal papa = (Pappal)animal;
		
//		Fish.show("fdafafa");
		
		Animal.Fish anime = new Animal.Fish();
		anime.show();
//		animal.makeNoise();
//		animal.makeSound();
//		main.makeBabyLion();
//		mama.makeFood();
//		papa.makeDrink(" hatdog");
//		papa.fly("lipad");
//		System.out.println(animal.calculateNoise());
//		
//		System.out.println("I am an animal");
	}
	static class Fish {
		 void show() {
			System.out.println("hello world " );
			
			class Alien{
				void catchAlien() {
					System.out.println("alien caught");
				}
			}
			Alien alien = new Alien();
			alien.catchAlien();
			
		}
	}
}
