/*
 * Create a program called ValidateOddNumber that asks the user to enter an odd number.
• If the inputted value cannot be converted to an integer, the program should print the value
enclosed in single quotes and " is not an integer".
• If the inputted value is not an odd integer, the program should print the value and " is not an
odd number".
• Otherwise, the program should print "Ok".
 */

import java.util.Scanner;

public class ValidateOddNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String scanned ="";
		int number = 0;

		try {
			System.out.print("Enter an odd number: ");
			scanned = scanner.nextLine();
			//you can't use scanner.nextLine twice, so you have to put scanned inside method
			number = Integer.parseInt(scanned);

			if (number % 2 == 0) {
				System.out.println("\n" + number + " is not an odd number");
			} else {
				System.out.println("\nOk");
			}
		} catch (NumberFormatException nfe) {
			System.out.println("'" + scanned + "'" + " is not an integer");
		}

		scanner.close();
	}

}