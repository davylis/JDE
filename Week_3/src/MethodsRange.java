
/*
 * Create a program called MethodsRange that has a method called printRange. The printRange
method should take the first and last integer to be printed as parameters. Then the method should
print all integers between the first integer and last integer. The main method should first input the
first and last integer from the user and then call the printRange method with the inputted values.
 */
import java.util.Scanner;

public class MethodsRange {

	public static void printRange(int first, int last) {
		for (int i = first; i <= last; i++) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first value: ");
		int first = Integer.parseInt(input.nextLine());

		System.out.print("Enter last value: ");
		int last = Integer.parseInt(input.nextLine());

		System.out.println();

		printRange(first, last);

		input.close();

	}

}