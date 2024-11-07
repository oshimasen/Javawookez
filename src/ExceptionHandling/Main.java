package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[]args)  {
//		int total = 0;
		try {
			method();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error bai");
			e.printStackTrace();
		}
//		try {
//			method();
//		}catch(ArrayIndexOutOfBoundsException e) { //FileNotFoundException | ArithmeticException | 
//			System.out.println(e.getMessage());
//		}
	}
	
	public static void method() throws FileNotFoundException{ //,  IOException
		
//		try (FileReader file = new FileReader("D:\\ACTION\\Java exercises\\helloJava.txt")) {
//			BufferedReader fInput = new BufferedReader(file);
//			throw new FileNotFoundException();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		int arr[] = {1,3,5,7};
		
		
		
//		System.out.println(arr[10]);
		
//		throw new IOException(); || not allowed
//		int x = 1;
//		return x;
		
		try{
//			System.out.println(arr[10]);
			int data = 50/0;
		}catch(ArithmeticException e) {
			System.out.println("error bai");
			e.printStackTrace();
		}
	}
}
