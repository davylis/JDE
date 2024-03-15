/*
 * Create a program called RegexLetters that first inputs a string from the user. If in the string contains
only Finnish vowels, the program should print "Vowels only". Otherwise, the program should print
"Not only vowels". Please check the string with a single regular expression.
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userString = input.nextLine();
		
		String regex = "(?i)[aeiouyåäöÅÄÖ]+";
		if(Pattern.matches(regex, userString)) {
			System.out.println("Vowels only");
		}else {
			System.out.println("Not only vowels!");
		}
		input.close();
	}
}
