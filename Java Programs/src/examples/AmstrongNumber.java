package examples;

import java.util.Scanner;
/**
 * Armstrong number: An n-digit number equal to the sum of the nth powers of its digits.
 * @author USER
 *
 */
public class AmstrongNumber {
	public static void main(String args[])
	   {
	      int n, sum = 0, temp, r;
	 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter a number to check if it is an armstrong number");      
	      n = in.nextInt();
	 
	      temp = n;
	 
	      while( temp != 0 )
	      {
	         r = temp%10;
	         sum = sum + r*r*r;
	         temp = temp/10; 
	      }
	 
	      if ( n == sum )
	         System.out.println("Entered number is an armstrong number.");
	      else
	         System.out.println("Entered number is not an armstrong number.");         
	   }
}
