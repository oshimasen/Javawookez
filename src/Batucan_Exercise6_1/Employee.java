package Batucan_Exercise6_1;

public abstract class Employee {

	private String name;
	private int employeeId;
	private double hourlyRate;

	/*
	 * A constructor for Employee class
	 * Initializes the name, employeeId and hourlyRate
	 * 
	 * @param name holds string value
	 * 
	 * @param employeeId holds int value
	 * 
	 * @param hourlyRate holds double value
	 */
	Employee(String name, int employeeId, double hourlyRate) {
		this.name = name;
		this.employeeId = employeeId;
		this.hourlyRate = hourlyRate;
	}

	/*
	 * Abstract method for calculatePay
	 */
	public abstract double calculatePay();

	/*
	 * A getter function for name
	 * 
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/*
	 * A setter function for name Initializes the string name
	 * 
	 * @param name holds string value
	 * 
	 * @return no return value
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * A getter function for employeeId
	 * 
	 * @param name holds string value
	 * 
	 * @return int employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/*
	 * A setter function for employeeId Initializes employeeId
	 * 
	 * @param employeeId holds int value
	 * 
	 * @return no return value
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/*
	 * A getter function for hourlyrate
	 * 
	 * @return double hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/*
	 * A setter function for hourlyRate Initializes the hourlyRate
	 * 
	 * @param hourlyRate holds double value
	 * 
	 * @return no return value
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

}
