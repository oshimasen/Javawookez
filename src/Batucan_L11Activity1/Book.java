package Batucan_L11Activity1;

public class Book implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String author;
	private int yearPublished;
	private boolean isRented;


	/*
	 * Initializes the fields using parameters
	 * @param title hold string value
	 * @param author holds string value
	 * @param year published holds int value
	 *
	 */
	Book(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		isRented = false;
	}
	
	/*
	 * Returns isRented value
	 * 
	 * @return boolean value
	 */
	public boolean getIsRented() {
		return isRented;
	}
	
	/*
	 * Assigns isRented with true value
	 * 
	 * @return no return value
	 */
	public void rent() {
		isRented = true;
	}
	/*
	 * Returns the string value of the title, author and year published
	 * 
	 * @return String value
	 */
	public String toString() {
		return title + "\t" + author + "\t" + yearPublished;
	}
}
