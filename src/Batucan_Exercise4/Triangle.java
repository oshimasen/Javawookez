package Batucan_Exercise4;
import java.text.DecimalFormat;

public class Triangle {

	
	//Declare fields
	private double sides;
	private double base;
	public final DecimalFormat df1 = new DecimalFormat( "#.##" );

	/*
	 * Initializes the fields
	 * 
	 * @param s holds the value double
	 * @param b holds the value double
	 * 
	 */
	Triangle(double s, double b) {
		this.sides = s;
		this.base = b;
	}

	/*
	 * Returns the sides value
	 * 
	 * @return a double value
	 */
	public double getSides() {
		return sides;
	}

	/*
	 * Returns the base value
	 * 
	 * @return a double value
	 */
	public double getBase() {
		return base;
	}

	/*
	 * Returns 0.0 value
	 * 
	 * @return a double value
	 */
	public double calculateArea() {
		return 0.0;
	}

	/*
	 * Returns 0.0 value
	 * 
	 * @return a double value
	 */
	public double calculatePerimeter() {
		return 0.0;
	}

}
