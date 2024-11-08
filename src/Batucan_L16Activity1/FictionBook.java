package Batucan_L16Activity1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FictionBook extends Book {
	
	//initializes the fine and max allowable day 
	static final int FINE_PER_DAY = 10;
	static final int MAX_ALLOWABLE_DAY = 21;

	/*
	 * Initializes the fields of superclass Book
	 * @param title holds the  value string
	 * @param author holds the  value string
	 * @param yearPublished holds the value int
	 * 
	 */
	FictionBook(String title, String author, int yearPublished) {
		super(title, author, yearPublished);
	}
	
	/*
	 * Returns a localDate in consideration of max allowable day
	 * 
	 * @return returns LocalDate value
	 */
	public static LocalDate getDueDate() {
		LocalDate localDate = LocalDate.now().plusDays(MAX_ALLOWABLE_DAY);
		return localDate;
	}

	/*
	 * Calculates the difference between returnDate and dueDate and outputs the fine
	 * 
	 * @return returns double value
	 */
	public double calculateFine(LocalDate returnDate2) {

		double fine = 0;
		if (returnDate2.isAfter(getDueDate())) {
			fine = Math.abs(ChronoUnit.DAYS.between(returnDate2, getDueDate()) * FINE_PER_DAY);
		}
		return fine;
	}

	/*
	 * Returns and converts the return date, due date and fine into string
	 * 
	 * @return returns String value
	 */
	public String displayDates() {

		return "\tReturn Date: " + super.returnDate + "\tDue Date: " + getDueDate() + "\tFine: "
				+ calculateFine(returnDate);
	}
	
	

}
