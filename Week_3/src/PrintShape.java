/*
 * Create a program called PrintShape. The program should first input the height and width of a shape
from the user. Then the program should print the shape using the asterisk (*) as shown in the
example output.
 */
import java.util.Scanner;

public class PrintShape {

	public static void main(String[] args) {
		//Create a scanner
		Scanner input = new Scanner(System.in);
		//input width
		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());
		//input height
		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());
		// close scanner
		input.close();
		//print asterisk shape
		System.out.println();
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
		System.out.println();
		}

	}

}
