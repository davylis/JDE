/*
 * Create a program called FixedTerm to compute interest for the initial deposit in a fixed term savings
account.
A fixed term savings account allows you to lock away a sum of money for an agreed time period.
Assume that
• The interest rate is fixed
• The annual interest is left to balance
• We can withdraw the money only at the end of the agreed time period.
• The bank subtracts capital income tax from the compound interest when we withdraw the
money at the end of the time period.
The program should first input the initial deposit, number of years, interest rate (%), and capital
income tax rate (%). Then the program should compute and show the compound interest and the
balance at the end of each year. Finally, the program should show the interest after tax and the
remaining balance after tax
NB! You should compute the result in a simple for loop where you keep adding the annual interest
to the balance etc. If you try to use some pre-defined compound interest formula, it might give you
slightly different results. NB! Please change your calculation order if the last decimal on some value
differs from the example output.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class FixedTerm {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		
		System.out.print("Enter initial deposit: ");
		double deposit = readDouble(input);
		
		System.out.print("Enter time period in full years: ");
		double years = readDouble(input);
		
		System.out.print("Enter interest rate (%): ");
		double rate = readDouble(input);
		
		System.out.print("Enter capital income tax rate (%): ");
		double incomeTax = readDouble(input);
		
		System.out.println();  	
		
		rate /= 100;
		incomeTax /= 100;
		double balance = deposit;
		double totalInterest = 0.00;
		double interest  = 0.00;
		
		for(int y = 1; y <= years; y++) {
			interest = balance * rate;
			balance += interest;
			totalInterest += interest;
			
			String output = "Year " + y + ": " + twoDecimal.format(interest) + " | " + twoDecimal.format(balance);
            System.out.println(output);
		}
		//double afterTax = totalInterest *( 1.0-incomeTax);
		double afterTax = totalInterest * incomeTax;
		System.out.printf("\nThe interest after tax is %.2f\n", totalInterest - afterTax);
		System.out.printf("The remaining balance after tax is %.2f\n", deposit + (totalInterest - afterTax));
	}
		
		private static double readDouble(Scanner scanner) {
			return Double.parseDouble(scanner.nextLine().replace(',', '.'));
		}
		
	}