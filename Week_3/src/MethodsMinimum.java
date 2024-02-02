
/*
 * Create a program called MethodsMinimum that has a method called minimum that takes three
integers as parameters. The method should return the smallest of the three integers.
The main method should first input three integers from the user and then call the minimum
method. Finally, the main method should print the value that the minimum method has returned.
The minimum method should not print anything
 */
import java.util.Scanner;

public class MethodsMinimum {

	public static int minimum(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		} else if (b <= a && b <= c) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int first = Integer.parseInt(input.nextLine());

		System.out.print("Enter second integer: ");
		int second = Integer.parseInt(input.nextLine());

		System.out.print("Enter third integer: ");
		int third = Integer.parseInt(input.nextLine());

		System.out.println();

		int minValue = minimum(first, second, third);

		System.out.println("The minimum value is " + minValue);

		input.close();

	}

}