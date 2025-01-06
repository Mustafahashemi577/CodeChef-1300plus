import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumTrio
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    long a[] = new long [n];
		    for(int i = 0;i<n;i++) a[i]=scan.nextLong();
		    Arrays.sort(a);
		    long result = (a[n-1]-a[0])*a[n-2];
		    System.out.println(result);
		}

	}
}

