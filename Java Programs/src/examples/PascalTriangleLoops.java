package examples;

import java.util.Scanner;

/**
 * We will first see how to generate a (unformatted ) Pascal's triangle using
 * simple looping statements. We maintain two int arrays, named currentRow and
 * previousRow. Initially, previousRow would be initialised with { 1 } - the
 * contents of the first row of the Pascal's triangle. After that, we have a
 * loop whose loop counter, i runs from 2 to n where n is the number of rows
 * that we wish to display. At any iteration, I represents the row number that
 * we are printing. The currentRow will be initialised with an array of i (the
 * loop counter) elements with the first and the last element of the array set
 * to '1'. Next, we have an inner loop whose task is to compute the elements of
 * currentRow. To do so, the loop counter, j runs from 0 to i-3. The numbers in
 * the array previousRow at indices j and j+1 are added and the result is stored
 * at the index j+1 of currentRow. When the inner loop exits, currentRow would
 * be populated. The values stored in currentRow are printed and previousRow is
 * assigned with currentRow so that it can be used in the next iteration of the
 * outer loop.
 * 
 * @author USER
 * 
 */
public class PascalTriangleLoops {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.print("Enter the row number upto which Pascal's triangle has to be printed: ");
		int row = scanner.nextInt();
		print(row);
	}

	public static void print(int n) {
		int[] previousRow;
		int[] currentRow = { 1 };
		printArray(currentRow);
		previousRow = currentRow;
		for (int i = 2; i <= n; i++) {
			currentRow = new int[i];
			currentRow[0] = 1;
			currentRow[i - 1] = 1;
			for (int j = 0; j <= i - 3; j++) {
				currentRow[j + 1] = previousRow[j] + previousRow[j + 1];
			}
			printArray(currentRow);
			previousRow = currentRow;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
