/*
 * Create a program called ArraysFinnish that inputs an English word from 
 * the user and translates it to Finnish. This time, the program can translate
 *  only the following words: "bus", "car", "cat", "house", "moon", "sun", 
 *  "thanks", "train", "teacher" If the English word is unknown, the program
 *   should display "Unknown word". Use two arrays in the program.
 */
import java.util.Scanner;

public class ArraysFinnish {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] englishArray = { "bus", "car", "cat", "house", "moon", "sun", "thanks", "train", "teacher" };
		String[] finnishArray = { "bussi", "auto", "kissa", "talo", "kuu", "aurinko", "kiitos", "juna", "opettaja" };
		System.out.print("Enter an English word: ");
		String englishWord = input.nextLine().toLowerCase();
		
		boolean check = false;
		for (int i = 0; i < englishArray.length; i++) {
			if (englishArray[i].equals(englishWord)) {
				check = true;
				System.out.println(finnishArray[i]);
			}
		}
		if(!check) {
			System.out.println("Unknown word");
		}
	}
}