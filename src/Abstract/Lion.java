package Abstract;

public abstract class Lion extends Animal implements Mammal, Pappal{
	
	public abstract void makeNoise();
	public abstract void makeSound();
	
	public void makeBabyLion() {
		System.out.println("sheeesh");
	}
	public void makeFood() {
		System.out.println("Lion eats lion");
	}
	public void makeDrink(String an) {
		System.out.println("Lion drinks lion" + an);
	}
}
