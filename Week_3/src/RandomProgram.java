/*
 * Create a program called RandomProgram that asks the user to guess an integer between 0 and 99.
If the user guesses too low, your program should print "The correct number is larger!". If the guess
is too high, the program should print "The correct number is smaller!".
The program should continue to prompt for new guesses until the user enters the correct number.
When the user guesses the correct number, the program should print "Correct!" and end.
 */
import java.util.Random;
import java.util.Scanner;

public class RandomProgram {
	static Random randomNumber = new Random();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = randomNumber.nextInt(100);

		System.out.print("Guess a number (0-99): ");
		
		int guess;
		do {
			guess = input.nextInt();
			
			if(guess < number) {
				System.out.print("The correct number is larger!\n\nGuess again: ");
			}else if(guess > number) {
				System.out.print("The correct number is smaller!\n\nGuess again: ");
			} else {
				System.out.print("Correct");
			}
			
		} while (guess != number);
		
		input.close();
	}
}