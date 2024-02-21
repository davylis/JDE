/*
 * Create a program called ObjectsSongArray. The program is a variation of the Objects Song Program
exercise.

Reuse the Song class (no modifications should be needed) from the previous exercise and create an
array of three Songs. Then create three Song objects and save their references to the array. See the
example output for the song names etc. You can either use an array initializer or create the Song
objects separately.

Finally, the program should iterate the array and print a song list exactly as shown in the example
output. This time, use the getters to get data from the Song objects.
 */

import java.util.ArrayList;

class Song {
	Song(String n, String a, int y) {
		this.name = n;
		this.artist = a;
		this.year = y;
	}

	public String getName() {
		return this.name;
	}

	public String getArtist() {
		return this.artist;
	}

	public int getYear() {
		return this.year;
	}

	public String toString() {
		return this.name + " (" + this.artist + ", " + this.year + ")";
	}

	private String name;
	private String artist;
	private int year;
}

public class ObjectsSongArray {

	public static void main(String[] args) {
		Song song1 = new Song("Easy on me", "Adele", 2021);
		Song song2 = new Song("Shivers", "Ed Sheeran", 2021);
		Song song3 = new Song("Holy Ghost Fire", "Larkin Poe", 2020);

	//	Song[] songs = {song1, song2, song3};
		
		ArrayList<Song> songs = new ArrayList<Song>();
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);

		System.out.println("=== List of songs ===");
		for (Song s : songs) {
			System.out.println(s.getArtist() + ": " + s.getName() + " (" + s.getYear() + ")");
		}
	}
}