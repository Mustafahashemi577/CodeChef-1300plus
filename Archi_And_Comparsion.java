import java.util.*;
import java.lang.*;
import java.io.*;

class Archi_And_Comparsion
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int a = scan.nextInt();
	        int b = scan.nextInt();
	        int n = scan.nextInt();
	        if(a<0 && n%2==0)
	        a=Math.abs(a);
	        if(b<0 && n%2==0)
	        b=Math.abs(b);
	        
	        if(a==b)
	        System.out.println(0);
	        else
	        System.out.println(a>b?1:2);
	    }
	}
}
