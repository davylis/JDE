/*
 * Create a program called ArraysIteration that first inputs five 
 * integers from the user and saves them in an array. Then the program
 *  should print the integers in descending order on a single line.
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class ArraysIteration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer[] array = new Integer[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter an integer: ");
			array[i] = Integer.parseInt(input.nextLine());
		}
		
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println();
		
		for(int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
	}
}

