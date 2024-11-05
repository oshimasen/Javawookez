package Batucan_Exercise6_1;

public class ParttimeEmployee extends Employee {

	private int hoursWorked;

	/*
	 * A constructor for ParttimeEmployee class Initializes the hoursWorked
	 * 
	 * @param name holds String value
	 * 
	 * @param employeeId holds int value
	 * 
	 * @param hourlyRate holds double value
	 * 
	 * @param hoursWorked holds int value
	 */
	public ParttimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
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
