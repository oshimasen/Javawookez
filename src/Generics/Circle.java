package Generics;

public class Circle extends Shape implements Art {
	
	public String drawCircle() {
		return "circle";
	}

	public String drawSquare() {
		return null;
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return null;
	}
}
