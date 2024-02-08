
/*
 * Create a program called StringCharacters that first inputs
 *  a string from the user. Then the program should print the 
 *  number of letters, the number of digits, and the number 
 *  of other characters in the string.
 */
import java.util.Scanner;

public class StringCharacters {
	public static String askUser(String postfix) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + postfix + ": ");
		return input.nextLine();
	}

	public static void main(String[] args) {
		String sentence = askUser("a string");
		char[] sentenceArray = sentence.toCharArray();
		int letters = 0;
		int digits = 0;
		int other = 0;
		for (int i = 0; i < sentenceArray.length; i++) {
			// letters
			if (Character.isLetter(sentenceArray[i])) {
				letters++;
				// digits
			} else if (Character.isDigit(sentenceArray[i])) {
				digits++;
				// other characters
			} else {
				other++;
			}
		}
		System.out.println(letters + " letter(s)\n" + digits + " digit(s)\n" + other + " other character(s)");

	}

}		
