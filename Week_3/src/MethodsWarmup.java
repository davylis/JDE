/*
 * Create a program called MethodsWarmup that has a method called printNumbers. The
printNumbers method should print all positive even and odd numbers between 1 and 50 as shown
in the example output. The main method should call the printNumbers method.
 */

public class MethodsWarmup {

	public static void printNumbers() {
		// print even numbers
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

		for (int j = 50; j >= 1; j--) {
			if (j % 2 != 0) {
				System.out.print(j + " ");
			}
		}
	}

	public static void main(String[] args) {
		printNumbers();

	}

}
