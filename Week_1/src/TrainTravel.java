/*
 * Create a program called TrainTravel that first inputs the number of train trips the user makes per
month, the price of a single train ticket, and the price of the monthly season ticket (valid for one
month). Then the program should determine which one is the cheaper option (buying a monthly
season ticket or buying single tickets) and how much cheaper it is.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class TrainTravel {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// input number of train trips
		System.out.print("Enter the number of train trips: ");
		int trainTrips = Integer.parseInt(input.nextLine());
		
		// input of single ticket price
		System.out.print("Enter the single ticket price: ");
		double pricePerTicket = readDouble(input);
		
		// input of monthly season ticket price
		System.out.print("Enter the monthly season ticket price: ");
		double pricePerMonth = readDouble(input);
		
		// close scanner
		input.close();
		
		// make calculations
		double priceTicket = trainTrips * pricePerTicket;
		
		// print outcome by using if-else statement
		DecimalFormat df = new DecimalFormat("0.00");
		if(priceTicket < pricePerMonth) {
			System.out.println("\nBuying single tickets is " + df.format(pricePerMonth - priceTicket) + " euros cheaper.");
		}else if(priceTicket > pricePerMonth) {
			System.out.println("\nBuying a monthly season ticket is " + df.format(priceTicket - pricePerMonth) + " euros cheaper.");
		}else {
			System.out.println("\nThe total cost is the same.");
		}
	}
	
	//DoubleReader
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}