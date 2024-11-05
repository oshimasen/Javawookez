package Batucan_Exercise6_1;

public class FullTimeEmployee extends Employee {
	private double monthlySalary;

	/*
	 * A constructor for FullTimeEmployee class Initializes the hourlyRate to zero
	 * Initializes the monthlySalary
	 * 
	 * @param name holds string value
	 * 
	 * @param employeeId holds int value
	 * 
	 * @param monthlySalary holds double value
	 */
	public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
		super(name, employeeId, 0);
		this.monthlySalary = monthlySalary;
	}

	/*
	 * Returns the monthly salary
	 * 
	 * @return double monthlySalary
	 */
	public double calculatePay() {
		return monthlySalary;
	}
}
