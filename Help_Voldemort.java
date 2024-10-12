import java.util.*;
import java.lang.*;
import java.io.*;

class Help_Voldemort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int e [] = new int [n];
		long result = 0;
		for(int i = 0;i<n;i++) e[i]=scan.nextInt();
		Arrays.sort(e);
		for(int i = 1;i<n;i++)
		    result+=(e[i-1]*e[i]);
		System.out.println(result);
	}
}
