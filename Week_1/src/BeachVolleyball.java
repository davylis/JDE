/*
 * Create a program called BeachVolleyball for dividing expenses in a group of people who rent a
beach volleyball court.
The program should first input the number of people, the hourly rate of a court, and the length of
rental in full hours. Then the program should calculate how much each of them should pay. The
program should display the sum with two decimals.
• You can suppose that the user does not ever enter a zero.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class BeachVolleyball {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// input number of people
		System.out.print("Enter the number of people: ");
		int people = Integer.parseInt(input.nextLine());
		
		// input of hourly rate
		System.out.print("Enter the hourly rate: ");
		double hourlyRate = readDouble(input);
		
		// input of length of rental
		System.out.print("Enter the length of the rental (hours): ");
		int lengthRental = Integer.parseInt(input.nextLine());
		
		// close scanner
		input.close();
		
		// make calculations
		double rental = hourlyRate * lengthRental / people;
		
		// print outcome
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\nEach of the " + people + " people should pay " + df.format(rental) + " euros.");
	}
	
	//DoubleReader
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}