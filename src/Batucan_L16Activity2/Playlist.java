package Batucan_L16Activity2;

import java.util.LinkedList;

public class Playlist {

	private LinkedList<Song> playlist;
	private int currentSongIndex;
	static int removeItem;

	/*
	 * Instantiates values of playlist, currentSongIndex and pre-added some songs
	 */
	public Playlist() {
		this.playlist = new LinkedList<>();
		this.currentSongIndex = -1;
		playlist.add(new Song("pusong bato", "bato"));
		playlist.add(new Song("lord patawad", "oshi"));
		playlist.add(new Song("pretty eyes", "kariya"));
		playlist.add(new Song("move forward", "adi"));
	}

	/*
	 * Adds new song to the playlist
	 * 
	 * @param title holds string value
	 * 
	 * @param artist holds string value
	 * 
	 * @return no return value
	 */
	public void addSong(String title, String artist) {
		playlist.add(new Song(title, artist));
		if(currentSongIndex == playlist.size()-2)
			currentSongIndex = playlist.size() -1;
	}

	/*
	 * Displays the playlist items
	 * 
	 * @return no return value
	 */
	public void displayPlayList() {

		System.out.println("Playlist: ");
		for (Song song : playlist) {
			System.out.println("'" + song.songTitle + "' by " + song.artist);
		}
	}

	/*
	 * Removes a song in the playlist
	 * 
	 * @param title holds string value
	 * 
	 * @return no return value
	 */
	public void removeSong(String title) {

		for (Song song : playlist) {
			if (song.songTitle.contains(title))
				playlist.remove(song);
			break;
		}

		System.out.println("Song removed from the playlist.");
	}

	/*
	 * Display the current song Increments the current song index by 1
	 * 
	 * @return no return value
	 */
	public void displayCurrentSong() {
		if(currentSongIndex != playlist.size()-1) {
			currentSongIndex++;
			System.out.println("Current song: '" + playlist.get(currentSongIndex).songTitle + "' by "
					+ playlist.get(currentSongIndex).artist);
		}else {
			System.out.println("Current song: '" + playlist.get(currentSongIndex).songTitle + "' by "
					+ playlist.get(currentSongIndex).artist);
				
		}
		
	}

	/*
	 * Display the next song Checks if currentSongIndex is equal to the size of the
	 * playlist
	 * 
	 * @return no return value
	 */
	public void displayNextSong() {

		if (currentSongIndex == playlist.size() - 1)
			currentSongIndex = -1;

		System.out.println("Next song: '" + playlist.get(currentSongIndex + 1).songTitle + "' by "
				+ playlist.get(currentSongIndex + 1).artist);
	}

}
