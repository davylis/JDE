
/*
 * Create a program called SoftDrinks that first inputs the number of students and the number of soft
drink bottles from the user. Then the program should compute how many bottles of soft drinks
there are per student and how many leftover bottles there will be. Each student should get the
same number of bottles.
• You can suppose that the user does not ever enter a zero.
 */
import java.util.Scanner;

public class SoftDrinks {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		// input number of students
		System.out.print("Enter the number of students: ");
		int students = Integer.parseInt(input.nextLine());
		// input number of bottles
		System.out.print("Enter the number of bottles: ");
		int bottles = Integer.parseInt(input.nextLine());
		// close scanner
		input.close();
		// make calculations
		int bottlePerStudent = bottles / students;
		int leftOverBottles = bottles % students;
		// print outcome
		System.out.println("\nThere will be " + bottlePerStudent + " bottles for each student.");
		System.out.println("There will be " + leftOverBottles + " leftover bottles.");
	}
}
