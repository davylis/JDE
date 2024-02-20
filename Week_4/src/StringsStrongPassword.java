/*
 * Create a program called StringsStrongfPassword that has a method called checkStrength that
checks the strength of a password. The method should take a password as parameter and return
true if the password is strong enough. Otherwise, it should return false.

The main method first inputs a password from the user. Then it calls the method checkStrength
with the inputted password. Finally, the main method prints "OK" if the password is strong enough.
Otherwise it prints "Not strong enough!"

A password is considered to be strong enough if it has at least 8 characters and it includes
characters from at least three different categories. The four categories of characters are the
following: uppercase letters, lowercase letters, digits, and other characters.
 */

	import java.util.Scanner;
	
	public class StringsStrongPassword {
		
		public static boolean checkStrength(String password){	
			int count = countCategories(password);
			if(password.length() >= 8 && count >= 3) {
				return true;
			}else {
				return false;
			}
		}
		
		public static int countCategories(String password) {
			int count = 0;
			if(password.matches(".*[A-ZÅÄÖ].*")) {
				count++;
			}
			if(password.matches(".*[a-zåäö].*")){
				count++;
				
			}
			if(password.matches(".*[0-9].*")) {
				count++;
				
			}
			if(password.matches(".*[_$&+,:;=?@#|^'<>.*\\s()%!-].*")) {
				count++;
				
			}
			return count;
		}
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter password: ");
			String password = input.nextLine();
			
			boolean result = checkStrength(password);
			if(result) {
				System.out.println("OK");
			} else if(!result) {
				System.out.println("Not strong enough!");
			}
			input.close();
		}
	}
