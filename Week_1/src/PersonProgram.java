/*
 * Create a program called PersonProgram that first inputs 
 * age, given name, and profession from the user. Then the 
 * program should print the inputted data as shown in 
 * the example output
 */
import java.util.Scanner;

public class PersonProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter age: ");
		int age = Integer.parseInt(input.nextLine());

		System.out.print("Enter given name: ");
		String name = input.nextLine();

		System.out.print("Enter profession: ");
		String profession = input.nextLine();
		System.out.println("\n" + name + " is a " + profession + " who is " + age + " years of age.");

		input.close();

	}

}
