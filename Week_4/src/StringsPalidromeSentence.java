/*
 * Create a program called StringsPalindromeSentence that has a method called isPalindrome that
determines whether a string contains a palindrome. The method should take a string as parameter
and return true if the string contains a palindrome. Otherwise, the method should return false.
The main method string inputs a string from the user and then calls the method isPalindrome with
the inputted string. Finally, the main method prints either "Palindrome!" or "No palindrome".
 */

import java.util.Arrays;
import java.util.Scanner;

public class StringsPalidromeSentence {
	
	public static String cleanString(String string) {
		string = string.toLowerCase();
		return string.replaceAll("[\\s\\.\\,\\;\\?\\!\\'\\\"\\-]", "");
	}

	public static boolean isPalindrome(String string) {

		string = cleanString(string);
		
		StringBuilder input = new StringBuilder(string);		
		input.reverse();
		
		if (string.isEmpty() || string.matches(".*[\\d+].*")) return false;
		return (string.equals(input.toString()));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.nextLine();

		if (isPalindrome(string)) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("No Palindrome");
		}
	}
}
