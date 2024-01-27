
/*
 * Create a program called Decimal Program that first inputs two decimal values from the user. Then

the program should multiply the values together and print the calculations as shown in the example
output.
• The program should accept both comma and dot as decimal part separator
 */
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class decimalProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 input.useLocale(Locale.US);

		System.out.print("Enter a decimal number: ");
		String input1 = input.next(); 
		double number1 = input.nextDouble();

		System.out.print("Enter a decimal number: ");
		String input2 = input.next(); 
		double number2 = input.nextDouble();

		double result = number1 * number2;

		DecimalFormat formatter = new DecimalFormat("0.00");
		DecimalFormat formatter2 = new DecimalFormat("0.000000");

		System.out.println("\n" + number1 + " * " + number2 + " = " + formatter.format(result));
		System.out.println(number1 + " * " + number2 + " = " + formatter2.format(result));

		input.close();
	}
	private static double parseDecimal(String input) {
            return Double.parseDouble(input.replace(',', '.'));
	}

}