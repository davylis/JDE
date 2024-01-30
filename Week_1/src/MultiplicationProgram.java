/*
 * Create a program called Multiplication program that first inputs two decimal numbers from the
user. Then the program should compute and print the product of the decimal numbers as shown in
the example output
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplicationProgram {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // input x
        System.out.print("Enter x: ");
        BigDecimal x = readBigDecimal(input);

        // input y
        System.out.print("Enter y: ");
        BigDecimal y = readBigDecimal(input);

        // close scanner (if needed, but not necessary for System.in)
        // input.close();

        // make calculation
        BigDecimal result = x.multiply(y);

        // print outcome
        System.out.println("\n" + x + " * " + y + " = " + result);
    }

    // Read BigDecimal from user input
    private static BigDecimal readBigDecimal(Scanner input) {
        String userInput = input.next();
        return new BigDecimal(userInput);
    }
}