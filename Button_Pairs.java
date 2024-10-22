import java.util.*;
import java.lang.*;
import java.io.*;

class Button_Pairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++) a[i]= scan.nextInt();
		    int odd = 0;
		    if(n==1)
		        System.out.println(0);
		    else{
		        for(int i = 0;i<n;i++)
		            if(a[i]%2==1)
		                odd++;
		        System.out.println(odd==n?0:((long)odd*(n-odd)));
		    }
		}
	}
}
