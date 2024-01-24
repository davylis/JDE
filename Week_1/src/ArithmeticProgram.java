/*
 * Create a program called ArithmeticProgram that first inputs two 
 * integers and one decimal number from the user. Then the program 
 * should do three separate multiplications and show their results as 
 * shown in the example output.
 * -The program should accept both comma and dot as decimal part separator.
 * -The program should not format numbers for printing
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class ArithmeticProgram {   
	public static void main(String[] args) {
		DecimalFormat decfor = new DecimalFormat("0.0");
		// Create a scanner object
		Scanner scanner = new Scanner(System.in);
		
		//input two int and one decimal
		System.out.print("Enter an integer: ");
		int number1 = scanner.nextInt();
		
		System.out.print("Enter another integer: ");
		int number2 = scanner.nextInt();
		
		System.out.print("Enter an decimal number: ");
		double decimalNumber = scanner.nextDouble();
		
		//Perform 3 multiplications
		int result1 = number1 * number2;
		double result2 = number1 * decimalNumber;
		double result3 = number2 * decimalNumber;
		
		System.out.println("\n" + number1 + " * " + number2 + " = " + result1 + "\n " + number1 + " * " + decimalNumber + " = " + decfor.format(result2) + "\n" + number2 + " * " + decimalNumber + " = " + decfor.format(result3));
		
		scanner.close();
	}

}
