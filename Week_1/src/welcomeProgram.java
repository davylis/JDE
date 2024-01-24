
/*
 * Create a program called Welcome Program that first 
 *  inputs a person's name, title, and a greeting
 *  phrase. Then the program should print a greeting as 
 *  shown in the example output.
 */
import java.util.Scanner;

public class welcomeProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter name: ");
		String firstName = input.nextLine();

		System.out.print("Enter title: ");
		String title = input.nextLine();

		System.out.print("Enter phrase: ");
		String phrase = input.nextLine();
		System.out.println("\n" + phrase + " " + title + " " + firstName);

		input.close();
	}

}
