import java.util.*;
import java.lang.*;
import java.io.*;

class AdaAndTheStaircase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int a [] = new int [n];
		    long stairs = 0;
		    int previous = 0;
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		        stairs=stairs+(Math.abs(a[i]-previous-1)/k);
		        previous=a[i];
		    }
		    System.out.println(stairs);
		}
	}
}
