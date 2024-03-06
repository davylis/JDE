
/*
 * Create a program called Decimal Program that first inputs two decimal values from the user. Then

the program should multiply the values together and print the calculations as shown in the example
output.
• The program should accept both comma and dot as decimal part separator
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class decimalProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		String number1 = input.nextLine();
		double n1 = parseDecimal(number1);

		System.out.print("Enter a decimal number: ");
		String number2 = input.nextLine();
		double n2 = parseDecimal(number2);

		double result = n1 * n2;

		DecimalFormat formatter = new DecimalFormat("0.00");
		DecimalFormat formatter2 = new DecimalFormat("0.000000");

		System.out.println("\n" + n1 + " * " + n2 + " = " + formatter.format(result));
		System.out.println(n1 + " * " + n2 + " = " + formatter2.format(result));

		input.close();
	}
	private static double parseDecimal(String  input) {
            return Double.parseDouble(input.replace(',', '.'));
	}

}