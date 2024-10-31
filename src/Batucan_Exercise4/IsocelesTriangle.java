package Batucan_Exercise4;

public class IsocelesTriangle extends Triangle {

	/*
	 * Initializes the sides and base from superclass Triangle
	 * 
	 * @param s holds the value double
	 * 
	 * @param b holds the value double
	 */
	IsocelesTriangle() {
		super(3.0, 5.0);
	}

	/*
	 * Calculates the area of isoceles triangle
	 * 
	 * @return area with double value
	 */
	public double calculateArea() {
		
		double area = (Math.sqrt(Math.pow(getSides(), 2) - Math.pow(getBase(),2) / 4) * getBase()) / 2;

		return area;
	}

	/*
	 * Calculates the perimeter of isoceles triangle
	 * 
	 * @return perimeter with double value
	 */
	public double calculatePerimeter() {
		double perimeter = getBase() + (2 * getSides());
		
		return perimeter;
	}

	/*
	 * Returns a string value of the calculatearea and the calculateperimeter
	 * 
	 * @return a string value
	 */
	public String toString() {
		return "Area is : " + super.df1.format(calculateArea())+ "\nPerimeter is: " + super.df1.format(calculatePerimeter());
	}
}
