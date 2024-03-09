/*
 * Create a program called PositiveNumbers that first inputs integers from the user until the user
decides to quit by entering a zero. Then the program should compute and print the average of the
entered positive integers with one decimal. If the only entered value is a zero, the program should
print "No positive values".
 */
import java.util.Scanner;

public class PositiveNumbers {
	
	public static int getInt() {
		Scanner input = new Scanner(System.in);
		int buffer = 0;
		try {
			buffer = Integer.parseInt(input.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Wrong input, exception occured.");
		}
		return buffer;
	}

	public static void main(String[] args) {
		//create variables we use
		int input = 0;
		int total = 0;
		int count = 0;
		//input integer
		System.out.print("Enter first integer: ");
		input = getInt();
		//make while-loop for integer input
		while(input != 0) {
				if(input > 0){
					total += input;
					count ++;
				}
					System.out.print("Enter next integer: ");
					input = getInt();
		}
		//if input number is only 0
		if (count == 0) {
			System.out.println("No positive values.");
		} else {
			//calculate average
			double average = (double) total / count;
			System.out.println();
			System.out.printf("The average of the positive values is %.1f%n", average);
		}
	}
	}
	
