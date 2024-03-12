/*
 * Create a program called StringTrio that first inputs three strings from the user. Then the program
compares the strings and displays one of the following:
• The strings are equal in case-sensitive comparison
• The strings are equal in case-insensitive comparison
• The strings are not equal
 */
import java.util.Scanner;

public class StringTrio {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//input first string
		System.out.print("Enter first string: ");
		String first = input.nextLine();
		//input second string
		System.out.print("Enter first string: ");
		String second = input.nextLine();
		//input third string
		System.out.print("Enter first string: ");
		String third = input.nextLine();
		//compare strings in case-sensitive and case insensitive
		if (first.equals(second) && first.equals(third)) {
			System.out.println("The strings are equal in case-sensitive comparison");
		} else if(first.equalsIgnoreCase(second) && first.equalsIgnoreCase(third)){
			System.out.println("The strings are equal in case-insensitive comparison");
		} else {
			System.out.println("The strings are not equal");
		}
		input.close();
	}
}
