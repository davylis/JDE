/*
 * Create a program called ArraysLetters that first inputs a grade letter
 *  from user. Then the program should compute and show the percentage of 
 *  the grade letter found in an array that contains the following values:
 *   "A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "B", "A", "C", "C", "C"
 */

import java.util.Scanner;

public class ArraysLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] array = {"A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "B", "A", "C", "C", "C"};
		System.out.print("Enter letter: ");
		String letter = input.nextLine().toUpperCase();
		
		//valid input check
		if(!Character.isLetter(letter.charAt(0))) {
			System.out.println("Not a valid grade.");
			return;
		}
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(letter.equals(array[i])) {
				count++;
			}		
		}
		double calculation = ((double)count / array.length) * 100;
		System.out.printf("%.1f%%" ,calculation);
		}
	}


