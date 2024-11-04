package Batucan_L7Activity2;

public class Passenger {
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public String[] passport;
	public long pwdIDNumber;

	//a constructor that accepts parameters and assigned its value on the fields
	public Passenger(String name, char gender, String nationality, String dateOfBirth) {
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
	}

	//a constructor that accepts parameters and assigned its value on the fields
	public Passenger(String name, char gender, String nationality, String dateOfBirth, long pwdIDNumber) {
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.pwdIDNumber = pwdIDNumber;
	}

	//main function
	public static void main(String[] args) {

		//Instantiate the passenger object
		Passenger callPassenger = new Passenger("jake", 'M', "Japaneso", "Feb 31, 2024");
		Passenger callPassernger2 = new Passenger("jake", 'M', "Japaneso", "Feb 31, 2024", 1234567890);

		
		//prints the returned values of toString() and toString1()
		System.out.println(callPassenger.toString());
		System.out.println(callPassernger2.toString1());

	}
	//prints the name, gender, nationality and date of birth and return as a string
	public String toString() {
		return "Name: " + name + "\nGender : " + gender + "\nNationality : " + nationality + "\nDate Of Birth : "
				+ dateOfBirth;

	}
	//prints the name, gender, nationality, date of birth and pwd id number and return as a string
	public String toString1() {
		return "\nName: " + name + "\nGender : " + gender + "\nNationality : " + nationality + "\nDate Of Birth : "
				+ dateOfBirth + "\nPWD ID No : " + pwdIDNumber;

	}
}
