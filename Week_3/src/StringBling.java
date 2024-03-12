/*
 * Create a program called StringBling that inputs strings from the user until the user decides to quit
by entering the text "stop". The program should determine the longest entered string and print it
enclosed in single quotes. The text "stop" should not be considered when determining the longest
string.
• If it is a tie between two or more longest strings, the program should print the string, which the
user entered first.
• If the user does not enter anything else but "stop", the program should not print anything else
but "Nothing to be printed".
 */

import java.util.Scanner;

public class StringBling {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//create variables we use
		String longest = "";
		String word;
		//input string
		System.out.print("Enter first string: ");
		word = input.nextLine();
		//make while-loop for next string input
		while(!word.equalsIgnoreCase("stop")) {
				if(word.length() > longest.length()) {
					longest = word;
				} 
				System.out.print("Enter next string: ");
				word = input.nextLine();
		}
		System.out.println();
		if(longest.isEmpty()) {
			System.out.println("Nothing to be printed");
	}else {
		System.out.println("'" + longest + "'");
	}
	input.close();
}
}