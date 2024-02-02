
/*
 * Create a class called MethodsTools for storing generic methods. That is, the MethodsTools class is a
method library class, and it should not contain the main method. Copy your already existing code of
the minimum method from the MethodsMinimum class to the MethodsTools class and do the
minor modification to make the method accessible from outside of the MethodsTools class.
Then create a program called MethodsToolsProgram that uses the method minimum of the
MethodsTools class. The main method should input three integers from the user and call the
minimum method of the MethodsTools class to determine the minimum of the inputted values.
Finally, the main method should print the minimum value.
 */

import java.util.Scanner;

class MethodsTools {

	public static int minimum(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		} else if (b <= a && b <= c) {
			return b;
		} else {
			return c;
		}
	}
}

public class MethodsToolsProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int first = Integer.parseInt(input.nextLine());

		System.out.print("Enter second integer: ");
		int second = Integer.parseInt(input.nextLine());

		System.out.print("Enter third integer: ");
		int third = Integer.parseInt(input.nextLine());

		System.out.println();

		int minValue = MethodsTools.minimum(first, second, third);

		System.out.println("The minimum value is " + minValue);

		input.close();

	}

}