/*
 * Create a program called PrintNumbers_2. The program should be a new version of the
PrintNumbers_1 program. The program should also print the count of numbers it has printed.
 */

import java.util.Scanner;

public class PrintNumbers_2 {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		// input number
		System.out.print("Enter the middle number: ");
		int middle = Integer.parseInt(input.nextLine());
		//Scanner closer
		input.close();
		// print numbers
		int count = 0;
		for (int i = 1; i <= middle; i++) {
			System.out.print(i + " ");
			count++;
		}
		for (int j = middle - 1; j >= 1; j--) {
			System.out.print(j + " ");
			count++;
		}
		System.out.println("\n" + count + " numbers printed");
	}
}
