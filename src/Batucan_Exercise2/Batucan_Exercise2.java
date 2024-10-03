package Batucan_Exercise2;

public class Batucan_Exercise2 {
	public static void main(String[] args) {

//	String[]days = {"first", "second", "third", "fourth","fifth","sixth", "seventh", "eighth","ninth","tenth", "eleventh","twelfth"};
		byte twelveDays = 1;
		String[] sentItems = { "A partridge in a pear tree", "Two turtle doves", "Three French hens",
				"Four calling birds", "Five gold rings", "six geese a-laying", "seven swans a-swimming",
				"eight maids a-milking", "nine ladies dancing", "ten lords a-leaping", "eleven pipers piping",
				"twelve drummers drumming" };
		

		while (twelveDays < 13) {
			
			String song = ""; 
			switch (twelveDays) {
			case 1:
				System.out.println("On the " + twelveDays + "st" + " of Christmas my true love sent to me");
				song = sentItems[twelveDays-1];
				System.out.println(song);
				break;
			case 2:
				System.out.println("On the " + twelveDays + "nd" + " of Christmas my true love sent to me");
				song = song + sentItems[twelveDays-1];
				System.out.println("and " + song );
				break;
			case 3:
				System.out.println("On the " + twelveDays + "rd" + " of Christmas my true love sent to me");
				song = song +  sentItems[twelveDays-1];
				System.out.println("and " + song );
				break;
			default:
				System.out.println("On the " + twelveDays + "th" + " of Christmas my true love sent to me");
				song = song + sentItems[twelveDays-1];
				System.out.println("and " + song);
				break;
			}
			twelveDays++;
		}

	}
}

//APP. 1
//x++, ++x, x+1, 1+x

//APP. 2
//a.)	z = x + y;
//	x++;
//b.) if(count > 10)
//	System.out.println("Count is greater than 10");
//c.) x--
//	total -= x 
//d.) q % divisor = remainder
//	remainder = num - divisor * (num / divisor));

//APP. 3 initial value of product = 5, x = 5
//	final value of product is 30, x = 6

//APP. 4
//a. true
//b. false
//c. true
//d. false
//e. true
//f. 5
//g. false

//APP. 5
//a.) input % 2 == 1
//		odd += input;
//b.) value = Math.pow(2.3,3);
//c.) while (integer < 21){
//	int i = 0;
//	if(i%=0) {
//		System.out.println();
//	}
//	System.out.print(integer + "\t");
//	integer++; 
//	}
//d.)	for (int integer = 1; integer <21; integer++) {
//	int i = 0;
////	if(i%=0) {
////		System.out.println();
////	}
////	System.out.print(integer + "\t");
//}
