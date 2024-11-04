package Enum;

public class Dog {
	public static void main(String[]args) {
		
		
		Size size = Size.SMALL.JLPT.LARGE.MEDIUM.JLPT;
//		Size size1 = Size.SMALL;
		System.out.println(Size.valueOf("SMALL").measurement);
		Size.Preference.print();
		System.out.println(size.valueOf("PHILNITS").measurement);
		
	}
}

enum Size{
	SMALL("Height: 45.7 cm"),
	MEDIUM("Height: 50.7 cm"),
	LARGE("Height: 76.2 cm"),
	PHILNITS("October 27, 2024"),
	JLPT(1);
	
	
	;
	public String measurement;
	public int date;
	
	
	Size(int date){
		this.date = date;
	}
	Size(String measurement){
		this.measurement = measurement;
	}
	public static class Preference{
		public static void print() {
			System.out.println("hello print");
		}
	}
	
}