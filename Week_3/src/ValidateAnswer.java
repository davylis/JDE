
/*
 * Create a program called ValidateAnswer that asks the user to answer a simple mathematical
question. The question is the following: "What is 2 + 3?". The program should keep prompting for
an answer as shown in the example output until the user enters the correct answer.
 */
import java.util.Scanner;

public class ValidateAnswer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int buffer = 0;

		System.out.print("What is 2 + 3? ");

		while (buffer != 5) {
			try {
				buffer = Integer.parseInt(scanner.nextLine());
				
				if (buffer != 5) {
					System.out.print("Incorrect! Try again: ");
				}
			} catch (NumberFormatException nfe) {
				System.out.print("That is not a number! Try again: ");
			}
		}

		System.out.println("Correct!");

		scanner.close();
	}

}