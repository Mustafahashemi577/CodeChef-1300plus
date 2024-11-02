import java.util.*;
import java.lang.*;
import java.io.*;

class Maximum_Or_Minimum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int n=scan.nextInt();
            int a [] = new int[n];
            int c0=0,c1=0;
            for(int i = 0 ; i < n ; i++)
            {
                a[i]=scan.nextInt();
                if(a[i]==0)
                    c0++;
                else
                    c1++;
            }
            System.out.println(c0>c1?"0":"1");
        }
	}
}
