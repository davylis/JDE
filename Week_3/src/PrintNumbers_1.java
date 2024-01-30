
/*
 * Create a program called PrintNumbers_1 that first inputs an integer from the user. Then the
program should print integers on a single line as shown in the example output. If there are no
integers to be printed, the program should not print anything
 */
import java.util.Scanner;

public class PrintNumbers_1 {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		// input number
		System.out.print("Enter the middle number: ");
		int middle = Integer.parseInt(input.nextLine());
		// print numbers
		for (int i = 1; i <= middle; i++) {
			System.out.print(i + " ");
		}
		for (int j = middle - 1; j >= 1; j--) {
			System.out.print(j + " ");
		}
		input.close();
	}
}
