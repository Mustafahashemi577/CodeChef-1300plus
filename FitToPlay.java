import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    long a[] = new long[n];
		    for(int i = 0;i<n;i++)
		        a[i]=scan.nextLong();
		    Map<Integer,Long> map = new HashMap<>();
		    long maxi = 0;
		    for(int i=n-1;i>=0;i--){
		        maxi = Math.max(a[i],maxi);
		        map.put(i,maxi);
		    }
		    long diff = 0;
		    for(int i = 0;i<n;i++)
		        diff = Math.max(diff,map.get(i)-a[i]);
		    System.out.println(diff==0?"UNFIT":diff);
		}

	}
}

