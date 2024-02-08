/*
 * Create a program called StringStart that first inputs a string from the user. Then the program should
print the following: the string in all small letters, the string in all capital letters, and the length of the
string.
 */

import java.util.Scanner;

public class StringStart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String sentence = input.nextLine();
		System.out.println();

		// Lowercase
		System.out.println(sentence.toLowerCase());

		// Uppercase
		System.out.println(sentence.toUpperCase());

		// string length
		System.out.println(sentence.length() + " characters");

		input.close();
	}

}