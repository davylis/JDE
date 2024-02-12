
/*
 * First, create a class called ArraysLibrary for storing generic reusable methods. That is, the class is a
method library class and it does not have the main method. Instead, the class should have the
following methods: max, min, median, mean, and standardDeviation. Each method should take an
array of integers as parameter and return the appropriate result.
Then, create a program called ArraysDeviation that uses methods of the ArraysLibrary class. First,
the main method should ask the user how many values there are in the sample. Then, the main
method should input the values from the user and save them to an array. Finally, the program
should compute the required descriptive statistics from the sample data and display them. See the
example output for more details.
 */
import java.util.Iterator;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Arrays;

class ArraysLibrary {
	// for storing generic reusable methods
	// constructor

	// define max
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	// define min
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	// define median(medium number)
	public static double median(int[] array) {
		double median;
		Arrays.sort(array);

		if (array.length % 2 == 1) {
			median = (double) array[array.length / 2];
		} else {
			median = ((double) array[array.length / 2] + (double) array[array.length / 2 - 1]) / 2;
		}
		return median;
	}

	// define mean (average of sum)
	public static double mean(int[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		sum /= array.length;
		return sum;
	}

	// define standard deviation
	public static double standardDeviation(int[] x) {
		double mean = ArraysLibrary.mean(x);
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			double firstRow = (x[i] - mean);
			sum += Math.pow(firstRow, 2);
		}
		sum /= x.length - 1;
		return Math.sqrt(sum);
	}
}

public class ArraysDeviation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int number = Integer.parseInt(input.nextLine());
		// checking if number is above 4
		if (number < 4) {
			System.out.println("Sorry, at least 4 values required");
			System.exit(0);
		}

		int[] arrr = new int[number];

		for (int i = 0; i < number; i++) {
			System.out.print("Enter an integer: ");
			arrr[i] = Integer.parseInt(input.nextLine());
		}
		// making copy of array, so it doesn't sort itself
		int[] copyOfArrr = new int[arrr.length];
		for (int j = 0; j < arrr.length; j++) {
			copyOfArrr[j] = arrr[j];
		}
		
		System.out.println();
		System.out.println("n = " + number);
		System.out.println("Min: " + ArraysLibrary.min(arrr));
		System.out.println("Max: " + ArraysLibrary.max(arrr));
		// formatting . to ,
		double meanValue = ArraysLibrary.mean(arrr);
		DecimalFormat df = new DecimalFormat("#,##0.0");
		System.out.println("Mean: " + df.format(meanValue));

		double medianValue = ArraysLibrary.median(arrr);
		System.out.println("Median: " + df.format(medianValue));

		System.out.printf("Sample standard deviation: %.1f\n", ArraysLibrary.standardDeviation(arrr));
		System.out.print("Sample data: ");
		String result = "";
		for (int j = 0; j < copyOfArrr.length; j++) {
			System.out.print(copyOfArrr[j] + " ");
		}
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
