package Batucan_Lesson32Activity1;

public class Batucan_Lesson32Activity1 {
	public static void main(String[] args) {
		int gryffindor = 100; // gryffindor points
		int ravenclaw = 205; // ravenclaw points
		int margin;

		margin = gryffindor - ravenclaw;

		if (margin >= 300) {
			System.out.println(margin + " point/s! Gryffindor takes the house cup!");
		} else if (margin >= 0) {
			System.out.println(margin + " point/s! In second place, Gryffindor!");
		} else if (margin >= -100) {
			System.out.println(margin + " point/s! In third place, Gryffindor!");
		} else {
			System.out.println(margin + " point/s! In fourth place, Gryffindor!");
		}
	}
}
