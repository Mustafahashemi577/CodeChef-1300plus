import java.util.*;
import java.lang.*;
import java.io.*;

class Maximise_Function
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++) a[i]=scan.nextInt();
		    Arrays.sort(a);
		    long sum = (Math.abs((long)a[n-1]-(long)a[0]))+(Math.abs((long)a[1]-(long)a[0]))+(Math.abs((long)a[n-1]-(long)a[1]));
		    System.out.println(sum);
		}
	}
}
