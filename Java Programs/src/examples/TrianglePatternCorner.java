package examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrianglePatternCorner {
	 public static void main ( String arg[] ){
	        InputStreamReader istream = new InputStreamReader(System.in) ;
	        BufferedReader read = new BufferedReader(istream) ;
	        System.out.print("Enter Triangle Size : ");
	        int num=0;
	        try{
	            num=Integer.parseInt( read.readLine() );
	        } catch(Exception Number){
	            System.out.println("Invalid Number!");
	        }
	            for(int i=1;i<=num;i++){
	                for(int j=1;j<=num-(i-1);j++){
	                    System.out.print("*");
	                    if(j==num-(i-1)){
	                        for(int k=1;k<=i;k+=1){
	                            System.out.print(" ");
	                        }
	                        for(int s=1;s<i;s++){
	                            System.out.print(" ");
	                        }
	                        for(int l=1;l<=num-(i-1);l++){
	                            System.out.print("*");
	                        }
	                    }
	                }
	                System.out.println();
	            }
	    }
}
