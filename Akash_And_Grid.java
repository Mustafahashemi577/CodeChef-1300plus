import java.util.*;
import java.lang.*;
import java.io.*;

class Akash_And_Grid
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
		    int n=scan.nextInt();
            int x=scan.nextInt();
            int y=scan.nextInt();
            int xc=(n+1)/2;
            int yc=(n+1)/2;
            if((Math.abs(xc-x)+Math.abs(yc-y))%2==0)
            System.out.println(0);
            else
            System.out.println(1);
	    }
	}
}
