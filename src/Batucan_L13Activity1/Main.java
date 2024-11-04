package Batucan_L13Activity1;

public class Main {

	/*
	 * Instantiate the Dog Class
	 * Calls the selectDogSize method from dog class 
	 * @param args holds String value
	 * @return no return value
	 */
	public static void main(String[]args) {
		Dog dog1 = new Dog("SMALL");
		dog1.selectDogSize();
		Dog dog2 = new Dog("MEDIUM");
		dog2.selectDogSize();
		Dog dog3 = new Dog("LARGE");
		dog3.selectDogSize();
		Dog dog4 = new Dog("XLARGE");
		dog4.selectDogSize();
		Dog dog5 = new Dog("TINY");
		dog5.selectDogSize();
	}
}
