/*
 * Create a program called StringPasswordStrength that has a method called 
 * checkStrength that checks whether a password meets the requirements. 
 * The method should take a username and password as parameters and return
 *  true if the password passes the validation. Otherwise, it should return
 *   false. The main method first inputs a user name and password from the 
 *   user and then calls the method checkStrength with the inputted data. 
 *   Finally, the main method should print "OK" if the password strength is ok. 
 *   Otherwise, it should print "NOT OK" The password validation rules are the following:
• A password should be at least nine characters long.
• A password should not include the username.
 */
import java.util.Scanner;

public class StringPasswordStrength {
	public static String askUser(String postfix) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + postfix + ": ");
		return input.nextLine();
	}

	public static boolean checkStrength(String username, String password) {
		if (password.length() > 8 && !password.toLowerCase().contains(username.toLowerCase())) {
			return true;
		}
		return false;
	}

	// public static boolean checkStrength2(String username, String password) {
	// return (password.length() > 8 && !password.contains(username));
	// }

	public static void main(String[] args) {
		String username = askUser("username");
		String password = askUser("password");

		if (!checkStrength(username, password)) {
			System.out.println("NOT OK");
		} else {
			System.out.println("OK");
		}
	}

}
