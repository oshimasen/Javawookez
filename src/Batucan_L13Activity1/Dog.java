package Batucan_L13Activity1;


public class Dog {

	static Size dogSize;
	/*
	 * Initialize the dogSize field
	 * @param dogSize holds String value
	 */
	Dog(String dogSize){
		Dog.dogSize = Size.valueOf(dogSize);
	}
	/*
	 * Checks if dogSize is null
	 * Checks if dogSize is TINY and display the appropriate display
	 * Else displays the appropriate display
	 * @return no return value
	 */
	public void selectDogSize() {
			
		if(dogSize != null) {
			if(dogSize.equals(Size.TINY))
				System.out.println("I don't know which you like");
			else
				System.out.println("I am a " + dogSize.measurement + " doggy");
		}
	}
	enum Size{
		SMALL("small"),
		MEDIUM("medium"),
		LARGE("large"),
		XLARGE("extra large"),
		TINY("tiny");
		
		String measurement;
		/*
		 * Initialize the measurement field
		 * @param measurement holds String value
		 */
		Size(String measurement){
			this.measurement = measurement;
		}
	}
}


