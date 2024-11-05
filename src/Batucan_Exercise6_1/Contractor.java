package Batucan_Exercise6_1;

public class Contractor extends Employee {
	private int hoursWorked;

	/*
	 * A constructor for Contractor class Initializes the hoursWorked
	 * 
	 * @param name holds String value
	 * 
	 * @param hourlyRate holds double value
	 * 
	 * @param hoursWorked holds int value
	 */
	public Contractor(String name, int employeeId, double hourlyRate, int hoursWorked) {
		super(name, employeeId, hourlyRate);
		this.hoursWorked = hoursWorked;
	}

	/*
	 * Returns the monthly salary
	 * 
	 * @return double monthlySalary
	 */
	public double calculatePay() {
		return getHourlyRate() * hoursWorked;
	}

}
