/*
 * Create a program called StringsAnagramOrNot that has a method called isAnagram that determines
whether two texts are anagrams of each other. The method should take two strings as parameters
and return true if the texts are anagrams of each other. Otherwise, the method should return false.
The main method first inputs two strings from the user and then calls the method isAnagram with
the inputted strings. Finally, the main method prints either "Anagram!" or "No anagram".
 */

import java.util.Arrays;
import java.util.Scanner;

public class StringsAnagramOrNot {

	public static String cleanString(String string) {
		string = string.toLowerCase();
		return string.replaceAll("[\\s\\.\\,\\;]", "");
	}

	public static boolean isAnagram(String first, String second) {

		if (first.isEmpty() || second.isEmpty())
			return false;

		if (first.matches(".*[\\d+].*") || second.matches(".*[\\d+].*"))
			return false;

		first = cleanString(first);
		char[] arr1 = first.toCharArray();
		Arrays.sort(arr1);
		first = new String(arr1);

		second = cleanString(second);
		char[] arr2 = second.toCharArray();
		Arrays.sort(arr2);
		second = new String(arr2);

		return (first.equals(second));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String first = input.nextLine();

		System.out.print("Enter second string: ");
		String second = input.nextLine();

		if (isAnagram(first, second)) {
			System.out.println("Anagram!");
		} else {
			System.out.println("No anagram");
		}
	}
}
