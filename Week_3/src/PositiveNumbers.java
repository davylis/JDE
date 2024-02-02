/*
 * Create a program called PositiveNumbers that first inputs integers from the user until the user
decides to quit by entering a zero. Then the program should compute and print the average of the
entered positive integers with one decimal. If the only entered value is a zero, the program should
print "No positive values"
 */
import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//create variables we use
		int total = 0;
		int count = 0;
		//input integer
		System.out.print("Enter first integer: ");
		//int numbers = Integer.parseInt(input.nextLine());
		//make while-loop for integer input
		while(true) {
			try {
				int number = Integer.parseInt(input.nextLine());
				
				if(number == 0) {
					break;
				}
				if(number > 0){
					total += number;
					count ++;
					
					System.out.print("Enter next integer: ");
				}	
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter an integer. ");
				System.out.print("Enter next integer: ");
			}
		}
		
		if (count == 0) {
			System.out.println("No positive values.");
		} else {
			double average = (double) total / count;
			System.out.printf("The average of the positive values is %.1f%n", average);
		}
		input.close();
	}
}
