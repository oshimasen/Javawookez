package Debugging;

public class debug {
	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		switch (x = 5) {
		case 5: System.out.println("helo");
			switch (y = 3) {
			case 3: System.out.println("hi");
			}
		}
	}
}
