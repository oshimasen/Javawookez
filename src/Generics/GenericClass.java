package Generics;

public class GenericClass<T extends Number> {
	public T data;
	
	public GenericClass(T data) {
		this.data = data;
	}
	
	public double calculatePay(int pay) {
		
		
		return data.doubleValue() * pay;
	}
}
