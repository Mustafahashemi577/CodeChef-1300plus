import java.util.*;
import java.lang.*;
import java.io.*;

class Splitting_Candies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    long n = scan.nextLong();
		    long k = scan.nextLong();
		    
		    System.out.println(k==0?"0 "+n:n/k+" "+n%k);
		}
	}
}
