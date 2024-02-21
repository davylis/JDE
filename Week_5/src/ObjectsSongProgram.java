/*
 * First, create a new class called Song as described in the diagram below. Do not add any other
features to the Song class. Note: The Song class should not contain any code for inputting data from
the user or printing data.

Then, create a main program called ObjectsSongProgram. In the program, create three objects from
the Song class and assign their references to reference variables. See the example output for the
song names, artists and years. NB! There should be exactly three variables in the main program. Not
less, not more. This time, do not use an array or ArrayList.
Finally, the program should print a song list as shown in the example output. In this exercise, use the
toString method to get data from each Song object to be printed.
 */
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
public class ObjectsSongProgram {

	public static void main(String[] args) {
		Song song1 = new Song("Easy on me", "Adele", 2021);
		Song song2 = new Song("Shivers", "Ed Sheeran", 2021);
		Song song3 = new Song("Holy Ghost Fire", "Larkin Poe", 2020);
		
		System.out.println(song1.toString());
		System.out.println(song2.toString());
		System.out.println(song3.toString());
	}
}