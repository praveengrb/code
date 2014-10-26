package examples;

import java.util.Scanner;

/**
 * The Pascal's triangle can also be visualised as the binomial coefficients in
 * the expansion of (x+y)n where n is the row of the Pascal's triangle, with the
 * rows labelled starting from n=0. Using this observation, one can calculate
 * the values in the Pascal's triangle by the direct application of the nCk
 * formulae. Now, the rows would be labelled from n=0 and the elements within a
 * row would be labelled from k=0. Using this numbering scheme, the element in
 * row n and at position k can be calculated as
 * 
 * nCk = n!/(k! * (n-k)! )
 * 
 * Given below is the program which uses this method to print the Pascal's
 * triangle.
 * 
 * @author USER
 * 
 */

public class PascalTriangleBynomialcoefficient {
	public static void print(int row) {
		for (int n = 0; n < row; n++) {
			for (int k = 0; k <= n; k++) {
				System.out.print(nCk(n, k) + " ");
			}
			System.out.println();
		}
	}

	public static int nCk(int n, int k) {
		int numerator = fact(n);
		int denominator = fact(k) * fact(n - k);
		int result = (int) (numerator / denominator);
		return result;
	}

	public static int fact(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.print("Enter the row number upto which Pascal's triangle has to be printed: ");
		int row = scanner.nextInt();
		print(row);
	}
}
