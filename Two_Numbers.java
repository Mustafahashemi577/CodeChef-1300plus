import java.util.*;
import java.lang.*;
import java.io.*;

class Two_Numbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        long a = scan.nextLong();
	        long b = scan.nextLong();
	        long n = scan.nextLong();
	        long c,d;
	        if(n%2==0){
	            c=a;
	            d=b;
	        }
	        else{
	            c=a*2;
	            d=b;
	        }
	        System.out.println(Math.max(c,d)/Math.min(c,d));
	    }
	}
}
