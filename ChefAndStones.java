import java.util.*;
import java.lang.*;
import java.io.*;

class ChefAndStones
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    long k = scan.nextLong();
		    long result = Integer.MIN_VALUE;
		    long a[] = new long [n];
		    long b[] = new long [n];
		    for(int i = 0;i<n;i++) a[i]=scan.nextLong();
		    for(int i = 0;i<n;i++){
		        b[i]=scan.nextLong();
		        result=Math.max(result,((k/a[i])*b[i]));
		    } 
		    System.out.println(result);
		}
	}
}
