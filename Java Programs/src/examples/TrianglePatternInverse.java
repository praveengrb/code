package examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrianglePatternInverse {
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
                for(int j=i;j>1;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=num-(i-1);k++){
                    System.out.print("*");
                    for(int k1=1;k1<k;k1+=k){
                        System.out.print("*");
                    }
                }
                System.out.println();          
    }
	}
}
