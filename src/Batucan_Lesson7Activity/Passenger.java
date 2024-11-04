package Batucan_Lesson7Activity;

import java.util.Arrays;

public class Passenger {
	
	//declare fields
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public String[] passport;

	//main function
	public static void main(String[] args) {

		//Instantiate  Passenger and assigned values
		Passenger passenger = new Passenger();
		passenger.name = "Oshi";
		passenger.gender = 'm';
		passenger.nationality = "Filipino";
		passenger.dateOfBirth = "December 06, 2000";
		passenger.passport = new String[] { passenger.name, passenger.nationality, passenger.dateOfBirth };
		
		
		//print or display the values
		System.out.println(passenger.name);
		System.out.println(passenger.gender);
		System.out.println(passenger.nationality);
		System.out.println(passenger.dateOfBirth);
		System.out.println(Arrays.toString(passenger.passport));
	}
}
