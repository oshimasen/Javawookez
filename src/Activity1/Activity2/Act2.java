package Activity2;

import java.util.Scanner;

public class Act2 {
	//di pwede ma local si static
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String name;
		String answer;
		String anime;

		System.out.println("Mayng Hapon! Unsay pangan nimo?");
		name = scanner.nextLine();

		System.out.println(
				"Ohh! Hi " + name + " ako diay si Oshi. Imong cute nga robot hihi\nMo tan-aw ba kag anime? [YES/NO]");
		answer = scanner.nextLine().toUpperCase();
		if (answer.equals("YES")) {
			System.out.println("Nice! Unsa imong favorite na anime? ");
			anime = scanner.nextLine().toUpperCase();
			if (anime.equals("ONE PIECE")) {
				System.out.println("Eyyyy!" + anime + " Nice choice! Ako pud!");
			} else {
				System.out.println("Nice! Nindot pud na! Anyway malibang sako... bye!");
			}
		} else {
			System.out.println("ay... gege bai libang sako...");
		}

	}
}
