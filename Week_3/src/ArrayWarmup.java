/*
 * Create a program called ArraysWarmup that has an array of six integers. The array should contain
the following values: 17, 1, 2, 0, 2, and 3. The program should iterate through the array elements
and print the values on single line.
 */

public class ArrayWarmup {

	public static void main(String[] args) {
		int array[] = {17, 1, 2, 0, 2, 3};
		for(int i = 0; i < array.length; i++) {
		System.out.print(array[i]+" ");
		}
	}
}
