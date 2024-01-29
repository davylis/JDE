/*
 * Create a program called DivisionAndRemainder that first inputs two integers x and y from the user.
Then the program should determine if the integers are even or odd. In addition, the program should
compute the remainder of x / y and the remainder of y / x.
• You can suppose that the user does not ever enter a zero.
• Hint: See the arithmetic operators in the course material.
 */
import java.util.Scanner;

public class DivisionAndRemainder {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		// input x
		System.out.print("Enter x: ");
		int x = Integer.parseInt(input.nextLine());
		// input y
		System.out.print("Enter y: ");
		int y = Integer.parseInt(input.nextLine());
		// if-else method for reaching even or odd for x
		if (x % 2 == 0) {
			System.out.println("\n" + x + " is even");
		} else {
			System.out.println("\n" + x + " is odd");
		}
		// if-else method for reaching even or odd for y
		if (y % 2 == 0) {
			System.out.println(y + " is even");
		} else {
			System.out.println(y + " is odd");
		}
		// creating remainder operations
		int remainder1 = x % y;
		int remainder2 = y % x;
		System.out.println("The remainder of " + x + " / " + y + " is " + remainder1);
		System.out.println("The remainder of " + y + " / " + x + " is " + remainder2);
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine());
	}
}
