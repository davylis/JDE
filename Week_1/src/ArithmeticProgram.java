
/*
 * Create a program called ArithmeticProgram that first inputs two 
 * integers and one decimal number from the user. Then the program 
 * should do three separate multiplications and show their results as 
 * shown in the example output.
 * -The program should accept both comma and dot as decimal part separator.
 * -The program should not format numbers for printing
 */
import java.util.Scanner;

public class ArithmeticProgram {
	public static void main(String[] args) {
		// Create a scanner object
		Scanner scanner = new Scanner(System.in);

		// input two int and one decimal
		System.out.print("Enter an integer: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter another integer: ");
		int number2 = scanner.nextInt();

		//scanner.nextLine();

		System.out.print("Enter a decimal number: ");
		String decimalNumber = scanner.nextLine();
		double n = Double.parseDouble(decimalNumber.replace(',', '.'));

		// Perform 3 multiplications
		int result1 = number1 * number2;
		double result2 = number1 * n;
		double result3 = n * n;
	
	
		System.out.println();
		
		System.out.println(number1 +" * " + number2 + " = " + result1);
		System.out.println(number1 +" * " + n + " = " + result2);
		System.out.println(n +" * " + n + " = " + result3);
		scanner.close();
	}

}