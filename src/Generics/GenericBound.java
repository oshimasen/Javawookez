package Generics;

public class GenericBound<T extends Shape & Art> {
	
	public T draw(T shape) {
		return shape;
	}
}
