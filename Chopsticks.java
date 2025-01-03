import java.util.*;
import java.lang.*;
import java.io.*;

class Chopsticks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		long d = scan.nextLong();
		long a[] = new long[n];
		for(int i = 0;i<n;i++) a[i]=scan.nextLong();
		Arrays.sort(a);
		int pairs = 0;
		for(int i = 0;i<n-1;i++){
		    if(a[i+1]-a[i]<=d){
		        i++;
		        pairs++;
		    }
		}
		System.out.println(pairs);

	}
}

