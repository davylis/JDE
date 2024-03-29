/*
 * Create a program called ObjectsSongArrayList. The program is a variation of the ObjectsSongArray
program.
Use the ArrayList class and create a list of Songs. Reuse the Song class from the previous exercise.
Create three Song objects and save their references to the list. See the example output for the song
names, artists and years. Finally, the program should iterate the list and print a song list exactly as
shown in the example output.
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

public class ObjectsSongArrayList {

	public static void main(String[] args) {
		Song song1 = new Song("Easy on Me", "Adele", 2021);
		Song song2 = new Song("Shivers", "Ed Sheeran", 2021);
		Song song3 = new Song("Holy Ghost Fire", "Larkin Poe", 2020);
			
		ArrayList<Song> songs = new ArrayList<Song>();
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);

		System.out.println("=== List of songs ===");
		for (Song s : songs) {
			System.out.println(s.getArtist() + ": " + s.getName() + " (" + s.getYear() + ")");
			System.out.println();
			System.out.println(s);
		}
	}
}
