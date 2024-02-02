
/*
 * 
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class ValidatePrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");

		try {
			System.out.print("Enter the price before VAT: ");
			double price = readDouble(scanner);

			double priceAfterVAT = price * 1.25;

			System.out.println();
			System.out.println("The VAT inclusive price is " + twoDecimal.format(priceAfterVAT));
		} catch (NumberFormatException nfe) {
			System.out.println("\nInvalid price!");
			return;
		}

		scanner.close();
	}

	private static double readDouble(Scanner scanner) {
		return Double.parseDouble(scanner.nextLine().replace(',', '.'));
	}

}
