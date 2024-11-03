import java.util.*;
import java.lang.*;
import java.io.*;

class Split_And_Maximize
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t  = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    long a [] = new long [n];
		    long sum = 0;
		    for(int i = 0; i < n; i++){
		        a[i]=scan.nextLong();
		        sum+=a[i];
		        sum=sum%998244353;
		    }
		    sum=(sum*(sum-1))%998244353;
		    System.out.println(sum);
		}
	}
}
