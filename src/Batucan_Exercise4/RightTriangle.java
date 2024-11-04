package Batucan_Exercise4;

public class RightTriangle extends Triangle {

	// Declares height with data type double
	private double height;

	/*
	 * Initializes the sides and base from superclass Triangle and the field height
	 * 
	 * @param s holds the value double
	 * 
	 * @param b holds the value double
	 */
	RightTriangle(double h) {
		super(3.0, 4.0);
		this.height = h;
	}

	/*
	 * Calculates the area of right triangle
	 * 
	 * @return are with double value
	 */
	public double calculateArea() {
		double area = (getBase() * height) / 2;

		return area;
	}

	/*
	 * Calculates the perimeter of right triangle
	 * 
	 * @return perimeter with a double value
	 */
	public double calculatePerimeter() {
		double perimeter = getSides() + getBase() + height;

		return perimeter;
	}

	/*
	 * Returns a string value of the calculatesArea and the calculateperimeter
	 * 
	 * @return a string value
	 */
	public String toString() {
		return "Area is : " + super.df1.format(calculateArea()) + "\nPerimeter is: " + super.df1.format(calculatePerimeter());
	}
}
