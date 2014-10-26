package examples;

import java.util.Scanner;
class MagicMatrix {
public static void main(String args[]) {
int n=2,i,j;

Scanner a = new Scanner(System.in);
System.out.println("enter the matrix ssize");
n=a.nextInt();
int b[][]=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=a.nextInt();
}
}
System.out.println("printing the matrix");
for(i=0;i<n;i++)
{
System.out.println("");
for(j=0;j<n;j++)
{
System.out.print(b[i][j]+"\t");
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(b[1][1]==b[i][i])
{
continue;
}
else
{
System.out.println("");
System.out.println("not a magic matrix");
break;
}
}
}
System.out.println("magic matrix");
}
}