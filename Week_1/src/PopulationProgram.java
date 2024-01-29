
/*
 * Create a program called PopulationProgram that first inputs the number of inhabitants of three
areas from the user. Then the program should calculate the percentage of population in each area.
The program should show the percentages with one decimal place as shown in the example output
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class PopulationProgram {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		// Using decimal formatter to get one decimal after a dot
		DecimalFormat oneDecimal = new DecimalFormat("0.0");
		// input area A
		System.out.print("Enter the population of the area A: ");
		double areaA = readDouble(input);
		// input area B
		System.out.print("Enter the population of the area B: ");
		double areaB = readDouble(input);
		// input area C
		System.out.print("Enter the population of the area C: ");
		double areaC = readDouble(input);
		// make a calculation
		double ACalculation = areaA / (areaA + areaB + areaC) * 100;
		double BCalculation = areaB / (areaA + areaB + areaC) * 100;
		double CCalculation = areaC / (areaA + areaB + areaC) * 100;
		// print output
		System.out.println("\nA: " + oneDecimal.format(ACalculation) + " %");
		System.out.println("B: " + oneDecimal.format(BCalculation) + " %");
		System.out.println("C: " + oneDecimal.format(CCalculation) + " %");
		// close scanner
		input.close();
		// method to obtain input
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine());
	}
}
