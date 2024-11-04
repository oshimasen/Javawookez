package Batucan_Exercise2;

public class Batucan_Exercise2 {
	public static void main(String[] args) {

		byte twelveDays = 1;
		String[] sentItems = { "A partridge in a pear tree", "Two turtle doves", "Three French hens",
				"Four calling birds", "Five gold rings", "Six geese a-laying", "Seven swans a-swimming",
				"Eight maids a-milking", "Nine ladies dancing", "Ten lords a-leaping", "Eleven pipers piping",
				"Twelve drummers drumming" };
		String song = "";

		while (twelveDays < 13) {

			switch (twelveDays) {
				case 1:
					System.out.println("\nOn the " + twelveDays + "st" + " of Christmas my true love sent to me");
					System.out.println(sentItems[twelveDays - 1]);
					song = "And " + sentItems[twelveDays - 1] + ".";
					break;
				case 2:
					System.out.println("\nOn the " + twelveDays + "nd" + " of Christmas my true love sent to me");
					song = sentItems[twelveDays - 1] + ",\n" + song;
					System.out.println(song);
					break;
				case 3:
					System.out.println("\nOn the " + twelveDays + "rd" + " of Christmas my true love sent to me");
					song = sentItems[twelveDays - 1] + ",\n" + song;
					System.out.println(song);
					break;
				default:
					System.out.println("\nOn the " + twelveDays + "th" + " of Christmas my true love sent to me");
					song = sentItems[twelveDays - 1] + ",\n" + song;
					System.out.println(song);
					break;
			}
			twelveDays++;
		}

	}
}