import java.util.*;
import java.lang.*;
import java.io.*;

class BobAndHisFriends
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    long a = scan.nextLong();
		    long b = scan.nextLong();
		    long c = scan.nextLong();
		    long f[] = new long [n];
            long m=Long.MAX_VALUE;
            for(int i=0;i<n;i++) f[i]=scan.nextLong();
            for(int i=0;i<n;i++) m=Math.min(m,Math.abs(a-f[i])+Math.abs(b-f[i]));
            System.out.println((long)c+m);
		}
	}
}
