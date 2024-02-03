/*
 * Create a program called MethodsPrimality that has a method called isPrime that takes a positive
integer as parameter and returns true if the integer is a prime. Otherwise, the method should return
false. The isPrime method should not input anything from the user or print anything.
A prime is an integer greater than 1 that has no positive divisors other than 1 and itself.
The main method should first input a positive integer from the user. Then the main method should
print all non-primes that are smaller than the inputted integer. The main method should call the
isPrime method to determine if an inputted integer is a prime or not.
If there are no non-primes that are smaller than the inputted integer, the main method should print
"Nothing to be printed".
Please use the for loop in the main method.
 */

import java.util.Scanner;

public class MethodsPrimality {
	
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		} 
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				// not a prime number
				return false;
			}
		}
	//prime number
	return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int integer = Integer.parseInt(input.nextLine());
		
		boolean search = false;
		
		for (int i = 1; i < integer; i++) {
			if(!isPrime(i)) {
				System.out.print(i + " ");
                search = true;
			}
		}
		if(!search) {
			System.out.println("Nothing to be printed");
		}
		input.close();
	}

}
