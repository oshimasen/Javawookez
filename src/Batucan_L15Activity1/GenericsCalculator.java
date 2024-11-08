package Batucan_L15Activity1;

public class GenericsCalculator <T extends Number> {

	private T num_1, num_2;

	/*
	 * Initializes the num1 and num2
	 * 
	 */
	GenericsCalculator(T num_1, T num_2) {
		this.num_1 = num_1;
		this.num_2 = num_2;
	}

	/*
	 * Returns the value of num_1
	 * 
	 * @return num_1 double value
	 */
	public double getNum_1() {
		return num_1.doubleValue();
	}

	/*
	 * Returns the value of num_2
	 * 
	 * @return num_2 double value
	 */
	public double getNum_2() {
		return num_2.doubleValue();
	}

	/*
	 * Adds num_1 and num_2
	 * 
	 * @return operation double value
	 */
	public  double addition() {
		return num_1.doubleValue() + num_2.doubleValue();
	}
	/*
	 * Subtracts num_1 and num_2
	 * 
	 * @return operation double value
	 */
	public double subtraction(){
		return num_1.doubleValue() - num_2.doubleValue();
	}
	/*
	 * Multiplies num_1 and num_2
	 * 
	 * @return operation double value
	 */
	public double multiplication() {
		return num_1.doubleValue() * num_2.doubleValue();
	}
	/*
	 * Divides num_1 and num_2
	 * 
	 * @return operation double value
	 */
	public double division() {
		return num_1.doubleValue() / num_2.doubleValue();
	}

}
