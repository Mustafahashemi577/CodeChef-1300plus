import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Minimum_Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++) a[i]=scan.nextLong();
            Arrays.sort(a);
            long r=a[0];
            for(int i=0;i<n-1;i++)
            {
                long v=0;
                if(a[i+1]%a[i]==0)
                v=a[i];
                else
                v=a[i+1]%a[i];
                if(r>v)
                r=v;
            }
            System.out.println(r*n);
        }
	}
}
