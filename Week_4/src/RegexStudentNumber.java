/*
 * Create a program called RegexStudentNumber that first inputs a student number from the user. If
the inputted data starts with '2' and contains exactly 8 digits, the program should print "OK".
Otherwise, the program should print "Invalid student number". Please validate the username with a
single regular expression.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexStudentNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter student number: ");
		String studentNumber = input.nextLine();
		//define the regular expression pattern
		//String regex = "^2\\d{7}$";
		if(studentNumber.matches("^2\\d{7}$")) {
			System.out.print("OK");	
		}else {
			System.out.print("Invalid student number");
		}
		input.close();
	}
}
