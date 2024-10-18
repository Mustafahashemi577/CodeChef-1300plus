import java.util.*;
import java.lang.*;
import java.io.*;

class Funny_Hand
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0)
        {
            int n=scan.nextInt();
            int a=scan.nextInt();
            int b=scan.nextInt();
            int result=0;
            if(Math.abs(a-b)==1)
            {
                if(Math.min(a,b)==1 || Math.max(a,b)==n)
                result=1;
                else
                result=2;
            }
            else if(Math.abs(a-b)==2)
            result=1;
            else
            result=0;
            System.out.println(result);
        }

	}
}
