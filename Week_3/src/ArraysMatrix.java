/*
 * Create a program called ArraysMatrix. First, copy/paste the main method below 
 * to your program lass. Then write the printMatrixSum method. The printMatrixSum 
 * method should print the sum of two matrices.
 */
public class ArraysMatrix {
	
	public static void printMatrixSum(int[][] m1,int[][] m2) {
		//This line starts a loop that iterates over rows of matrices. length gives the number of rows in the matrix 'm1'
		for(int i = 0; i < m1.length; i++) {
			//empty string called 'line' which will be used to construct the output line for each row.
			String line = "";
			//m1[0].length gives the number of columns in the matrix m1. It assumes that all rows have the same number of columns.
			for(int j = 0; j < m1.length; j++) {
				//calculates the sum of corresponding elements from matrices m1 and m2 for the current row and column. It converts the sum to a string and appends it to the line string, followed by a space.
				line += Integer.toString(m1[i][j] + m2[i][j]) + " ";
			}
			System.out.println(line);
		}
	}
	
	public static void main(String[] args) {
		int[][] m1 = { {1, 2, 0}, {2, 3, 4} };
		int[][] m2 = { {3, 2, 5}, {6, 4, 3} };
		int[][] m3 = { {1, 1, 1, 1}, {3, 2, 3, 1}, {2, 2, 2, 2} };
		int[][] m4 = { {2, 2, 3, 3}, {2, 3, 1, 0}, {1, 2, 3, 4} };
		printMatrixSum(m1, m2);
		System.out.println();
		printMatrixSum(m3, m4);
	}

}
