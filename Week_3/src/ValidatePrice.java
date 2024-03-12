
/*
 * Create a program called ValidatePrice that first inputs the product price before VAT from the user.
Then the program should compute and print the VAT inclusive price with two decimal places as
shown in the example output. Suppose that the VAT is always 25 %.
If the program fails to convert the inputted string to a double, it should print "Invalid price!".
• NB! You should use exception handling in this exercise.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class ValidatePrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		double priceAfterVAT = 0;

		try {
			System.out.print("Enter the price before VAT: ");
			double price = Double.parseDouble(scanner.nextLine().replace(',', '.'));

			priceAfterVAT = price * 1.25;

			System.out.println();
			System.out.println("The VAT inclusive price is " + twoDecimal.format(priceAfterVAT));
		} catch (NumberFormatException nfe) {
			System.out.println("\nInvalid price!");
			return;
		}

		scanner.close();
	}

//	private static double readDouble(Scanner scanner) {
//		return Double.parseDouble(scanner.nextLine().replace(',', '.'));
//	}

}
