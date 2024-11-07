package exception;

public class OutOfBoundDigitsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4688693966014557460L;
	/*
	 * A constructor for OutOfBoundDigitsException
	 */
	public OutOfBoundDigitsException(String message)  {
		super(message);

	}
	/*
	 * Validates the number if it is 10 digits
	 * Throw error message if not
	 * 
	 * @param number holds long value
	 * @return no return value
	 */
	public static void validateDigits(long number) throws OutOfBoundDigitsException {
		String str;
		int str_length;
		boolean isValid = false;
		
		str =  Long.toString(number);
		
		str_length = str.length();
		
		if(str_length == 10) {
			isValid = true;
		}
		if(!isValid) {
			throw new OutOfBoundDigitsException("\nInvalid phone number! Only 10-digit number is allowed\n");
		}
		
		
	}
	/*
	 * Returns an error message
	 * 
	 * @return a string value
	 */
	public String getMessage() {
		return "\nInvalid phone number! Only 10-digit number is allowed\n";
	}
}
