package Generics;

public class Main {
	public static void main(String[]args) {
		
//		GenericClass<Integer> genericInt = new GenericClass<>(1);
		GenericBound<Circle> genericString = new GenericBound<>();
		Circle circle = new Circle();
//		GenericClass<String> genericString = new GenericClass<>("hello");
//		GenericClass<Double> genericDouble = new GenericClass<>(10.5);
//		
		System.out.println(genericString.draw(circle)); 
		
//		System.out.println(genericInt.calculatePay(69));
//		System.out.println(genericInt.data + " " + genericString.data + " " + genericDouble.data);
		
//		GenericMethod generic = new GenericMethod();
//		
//		generic.<String>getGenericValue("olokolokolok");
//		generic.<Integer>getGenericValue(555);
		
		
	}
}
