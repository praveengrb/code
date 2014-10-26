package examples;

import java.util.Scanner;

public class FibonacciRecrussion {
	 public static void main(String args[]) {
		 
	        //input to print Fibonacci series upto how many numbers
	        System.out.print("Enter number upto which Fibonacci series to print: ");
	        int number = new Scanner(System.in).nextInt();
	 
	        System.out.println("\n\nFibonacci series upto " + number +" numbers : ");
	        //printing Fibonacci series upto number
	        for(int i=1; i<=number; i++){
	            System.out.print(fibonacciRecusion(i) +" ");
	        }
	    } 
	// Java program for Fibonacci number using recursion.
	    public static int fibonacciRecusion(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	 
	        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); //tail recursion
	    }
}
