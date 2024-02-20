/*
 * Create a program called StringsDecimalPart that first inputs a decimal number from the user. Then
the program determines how many digits there are after the decimal point in the decimal number.
Finally, the program prints the result.
If the inputted value is not a "proper decimal number", the program should print "Please enter a
proper decimal number".
 */

import java.text.DecimalFormat;
import java.util.Scanner;

	public class StringsDecimalPart {
	public static boolean isValidDec(String value) {
		return value.matches(".*\\d+\\.\\d+.*");
		}
	
//	public static int getDecimalLength(String value) {
//		String[] parts = value.split("\\.");
//		return parts[1].length();
//	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		Double decimal = readDouble(input);
		
		DecimalFormat decimalFormat = new DecimalFormat("#.##########");
		
		String decString = decimalFormat.format(decimal);
		
		if(isValidDec(decString)) {
			int decPartLength = decString.split("\\.")[1].length(); 
			System.out.println(decPartLength + " decimal place(s)");
		} else {
			System.out.println("Please enter a proper decimal number.");
		}
		
			
			//System.out.println(String.valueOf(decimal).split("\\.")[1].length()); 
		
		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
