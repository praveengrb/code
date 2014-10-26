package examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrianglePatternCornerInverse {

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
	                for(int j=num-i;j<num;j++){
	                    System.out.print("*");
	                    if(j==num-1){
	                        for(int k=i;k<=j+1;k+=1){
	                            System.out.print(" ");
	                        }
	                        for(int s=1;s<num-(i-1);s++){
	                            System.out.print(" ");
	                        }
	                        for(int l=num-i;l<num;l++){
	                            System.out.print("*");
	                        }
	                    }              
	                System.out.println();
	            }
	    }

}
}