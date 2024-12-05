import java.util.*;
import java.lang.*;
import java.io.*;

class XorAgain
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    long a[] = new long [n];
		    for(int i = 0;i<n;i++)
		        a[i]=2*scan.nextLong();
		    long result = 0;
		    for(long temp : a)
		        result ^= temp;
		    
		    System.out.println(result);
		}
	}
}
