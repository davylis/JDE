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
