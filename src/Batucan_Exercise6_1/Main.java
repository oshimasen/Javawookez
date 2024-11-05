package Batucan_Exercise6_1;

public class Main {
	/*
	 * Instantiate the FullTime, Contract and PartTime class Displays the salary of
	 * each employee
	 * 
	 * @param args holds string value
	 * 
	 * @return no return value
	 */
	public static void main(String[] args) {

		Employee fullTime = new FullTimeEmployee("oshi", 1, 21540.80);
		Employee contractor = new Contractor("justin", 2, 400.0, 7);
		Employee parttime = new ParttimeEmployee("adi", 3, 600.0, 6);

		System.out.println(fullTime.calculatePay());
		System.out.println(contractor.calculatePay());
		System.out.println(parttime.calculatePay());
	}
}
