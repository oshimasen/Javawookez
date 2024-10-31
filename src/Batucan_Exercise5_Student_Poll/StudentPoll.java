package Batucan_Exercise5_Student_Poll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class StudentPoll {

	/*
	 * Asks the user for an input from 1 to 10 Stores the input numbers to
	 * numbers.txt Reads the file to the very end and output it in output.txt
	 * 
	 * @return no return value
	 */
	public static void main(String[] args) {

		boolean isValid = true;
		Scanner scanner = new Scanner(System.in);
		File file = new File("D:\\ACTION\\Java exercises\\numbers.txt");
		File outFile = new File("D:\\ACTION\\Java exercises\\output.txt");

		try {
			Formatter formatter1 = new Formatter(file);
			Formatter formatter2 = new Formatter(outFile);
			Scanner sc = new Scanner(file);

			while (isValid) {
				System.out.print("Rate from 1 to 10: ");
				int answer = scanner.nextInt();
				if (answer >= 1 && answer <= 10) {
					formatter1.format("%d\n", answer);
					formatter1.flush();
				} else {
					System.out.println("\n[ Exiting the survey... ]");
					isValid = false;
				}
			}
			formatter1.close();

			while (sc.hasNext()) {
				formatter2.format("%d\n", sc.nextInt());
				formatter2.flush();
			}
			formatter2.close();
			sc.close();
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
