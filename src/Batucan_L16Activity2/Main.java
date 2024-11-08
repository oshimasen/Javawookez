package Batucan_L16Activity2;

import java.util.Scanner;

public class Main {
	/*
	 * Displays menu items Asks user to input hit choice
	 * 
	 * @param args holds String array value
	 * 
	 * @return no return value
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Playlist playlist = new Playlist();

		while (true) {
			System.out.println(
					"\n1. Add song to playlist\n2. Display playlist\n3. Remove a song from playlist\n4. Play a song\n5.Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter song title: ");
				String title = scanner.nextLine();
				System.out.print("Enter artist name: ");
				String artist = scanner.nextLine();
				playlist.addSong(title, artist);
				break;
			case 2:
				playlist.displayPlayList();
				break;
			case 3:
				System.out.print("Enter title of the song to remove: ");
				String songTitle = scanner.nextLine();
				playlist.removeSong(songTitle);
				break;
			case 4:
				playlist.displayCurrentSong();
				playlist.displayNextSong();
				break;
			case 5:
				System.out.println("Exiting playlist.");
				scanner.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice. Please enter again.");

			}

		}
	}

}
