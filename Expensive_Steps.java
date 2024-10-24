import java.util.*;
import java.lang.*;
import java.io.*;

class Expensive_Steps
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x1 = scan.nextInt();
		    int y1 = scan.nextInt();
		    int x2 = scan.nextInt();
		    int y2 = scan.nextInt();
		    if(n==1)
		        System.out.println(0);
		    else{
		        long sum2 =(Math.abs(x2-x1)+Math.abs(y2-y1));
		        x1 = Math.min(x1,n-x1+1);
		        y1 = Math.min(y1,n-y1+1);
		        x2 = Math.min(x2,n-x2+1);
		        y2 = Math.min(y2,n-y2+1);
		        long sum = Math.min(y1,x1)+Math.min(y2,x2);
		        System.out.println(Math.min(sum,sum2));
		    }
		}
	}
}
