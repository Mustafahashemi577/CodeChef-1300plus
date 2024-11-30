import java.util.*;
import java.lang.*;
import java.io.*;

class AkhilAndColoredBalls
{
	public static void main (String[] args) throws java.lang.Exception
	{
        
        Scanner scan =new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-->0)
	    {
	        String s1=scan.next();
	        String s2=scan.next();
	        for(int i=0;i<s1.length();i++)
	        {
	            if(s1.charAt(i)==s2.charAt(i))
	            {
	                if(s1.charAt(i)=='B')
	                System.out.print("W");
	                else
	                System.out.print("B");
	            }
	            else
	            System.out.print("B");
	        }
	        System.out.println();
	    }
	}
}
