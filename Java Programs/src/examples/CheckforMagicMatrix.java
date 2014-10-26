/**
 * 
 */
package examples;

import java.util.Arrays;

/**
 * @author USER
 *
 */
public class CheckforMagicMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] ipmatrix = new int[2][2];
		ipmatrix[0][0]=3;
		ipmatrix[0][1]=2;
		ipmatrix[1][0]=3;
		ipmatrix[1][1]=3;
		System.out.println(isMatrix(ipmatrix));	

	}
public static boolean isMatrix(int[][] ipmatrix){
	int[][] matrix = new int[ipmatrix.length][ipmatrix.length];
	for (int[] row: matrix)
		Arrays.fill(row, ipmatrix[0][0]);
	return Arrays.deepEquals(ipmatrix, matrix);
}
}
