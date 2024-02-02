
/*
 * Create a program called MethodsDiscount that has a method called computePercentage. The
computePercentage method should take list price and selling price as parameters. The method
should compute and return the discount percentage.
The main method should first input the prices from the user and then call the computePercentage
method with the inputted values. Finally, the main method should print the discount percentage
with two decimal places. The computePercentage method should not print anything.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsDiscount {

	public static double computePercentage(double listPrice, double sellPrice) {
		double discount = listPrice - sellPrice;
		double result = (discount / listPrice) * 100;
		return result;
	}

	private static double readDouble(String input) {
		return Double.parseDouble(input.replace(',', '.'));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("0.00");

		System.out.print("Enter list price: ");
		double listPrice = readDouble(scanner.nextLine());

		System.out.print("Enter selling price: ");
		double sellingPrice = readDouble(scanner.nextLine());

		System.out.println();

		double result = computePercentage(listPrice, sellingPrice);
		
		System.out.print("The discount percentage is " + formatter.format(result) + " %\n");

		scanner.close();

	}

}