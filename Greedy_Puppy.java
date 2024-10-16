import java.util.*;
import java.lang.*;
import java.io.*;

class Greedy_Puppy
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int max = 0;
		    for(int i = 2;i<=k;i++)
		        max = Math.max(n%i,max);
		    System.out.println(max);
		}
	}
}
