import java.util.*;
import java.lang.*;
import java.io.*;

class PermutationGCD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    if(x<n)
		    System.out.println("-1");
		    else{
		        int a = x-n+1;
		        System.out.print(a+" ");
		        for(int i = 1;i<=n;i++)
		            if(i!=a)
		                System.out.print(i+" ");
                System.out.println();
		    }
		}
	}
}
