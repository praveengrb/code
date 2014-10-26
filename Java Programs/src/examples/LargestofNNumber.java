/**
 * 
 */
package examples;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class LargestofNNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int num, i, temp, max;
		// Reading numbers want to be read 
		System.out.print("Enter number you want to enter:");
		num = data.nextInt();
		System.out.println("Enter " +num+ " number");
		// Reading 1st number
		max = data.nextInt();
		// Reading other number
		for (i=1; i < num; i++) { temp = data.nextInt();
		 if(temp < max)
		continue;
		else
		// largest number
		max = temp;
		}
		System.out.println("Largest Number is "+max);


	}

}
