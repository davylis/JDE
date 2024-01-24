/*
 * Create a program called SalesProgram that first inputs 
 * the price of the product (integer), product name and 
 * discount (integer) from the user. Then the program should
 *  print the product's selling price as shown in the example
 *   output.
 */
import java.util.Scanner;

public class SalesProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter price: ");
		int price = Integer.parseInt(input.nextLine());

		System.out.print("Enter product name: ");
		String name = input.nextLine();

		System.out.print("Enter discount: ");
		int discount = Integer.parseInt(input.nextLine());
				
		int discountSum = price - discount;
		System.out.println("\n" + "The selling price of a " + name + " is " + discountSum + " euros.");

		input.close();

			}
}
