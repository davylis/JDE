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
import java.util.Scanner;
import java.lang.Math;

class ArraysLibrary {
	// for storing generic reusable methods
	// constructor

	public static int max(int [] array) {
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int [] array) {
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

//	public double median(int [] array) {
//
//	}

	public static double mean(int [] array) {
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		sum /= array.length;			
		return sum;
	}

//	public double standardDeviation(int [] array) {
//
//	}
}

public class ArraysDeviation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arrr = {6, 54, 1, 43, 3};
		System.out.println(ArraysLibrary.max(arrr));
		System.out.println(ArraysLibrary.min(arrr));
		System.out.println(ArraysLibrary.mean(arrr));

	}

}
