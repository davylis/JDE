
/*
 * Create a program called MealProgram that calculates the cost of a meal at a restaurant. The
program should input the cost of the food, the tax rate, and the tip percentage (before tax) from the
user. Then the program should calculate and print the total cost of the meal as shown in the
example output.
• The program should accept both comma and dot as decimal part separator
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class MealProgram {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		// Using decimalformatter to get two decimals after a dot
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		// input price
		System.out.print("Enter the price of food: ");
		double price = readDouble(input);

		// input tax
		System.out.print("Enter the tax rate: ");
		double tax = readDouble(input);

		// input tip percentage
		System.out.print("Enter the tip percentage: ");
		double tip = readDouble(input);
		// calculation of price
		double calculation = price * tax / 100.00 + price * tip / 100.00 + price;
		System.out.println("\nThe total cost is " + twoDecimal.format(calculation));
		// scanner closes
		input.close();
	}

	// method to obtain input
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
