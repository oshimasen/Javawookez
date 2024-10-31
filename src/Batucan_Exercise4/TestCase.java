package Batucan_Exercise4;


public class TestCase {

	
	/*
	 * Calls the displayRightTriangle and displayIsocelesTriangle methods
	 * 
	 * @returns no return value
	 */
	public static void main(String[] args) {

		displayRightTriangle();
		displayIsocelesTriangle();
	}

	/*
	 * Display the right triangle area and perimeter value
	 * 
	 * @return no return value
	 */
	public static void displayRightTriangle() {
		Triangle t1 = new RightTriangle(5.0);

		System.out.println("\nThe Right Triangle is: \n" + t1.toString());
	}

	/*
	 * Display the isoceles triangle are and perimeter value
	 * 
	 * @return no return value
	 */
	public static void displayIsocelesTriangle() {
		Triangle t2 = new IsocelesTriangle();

		System.out.println("\nThe Isoceles Triangle is\n" + t2.toString());
	}
}
