package encapsulation;

public class Encapsulation {
	public static void main(String[]args) {
		Dog mydog = new Dog("Oshi");
		mydog.setColor("kuroi");
		
		System.out.println(mydog.getColor());
	}

}

class Dog{
	
	public String name;
	private String color;
	
	Dog(String name){
		this.name= name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
