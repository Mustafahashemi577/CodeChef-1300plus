import java.util.*;
import java.lang.*;
import java.io.*;

class Sorted_Substrings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String s = scan.next();
		    int count = 0;
		    for(int i = 0;i<n-1;i++)
		        if(s.charAt(i)=='1'&&s.charAt(i+1)=='0')
		            count++;
		    System.out.println(count);
		}
	}
}
