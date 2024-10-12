import java.util.*;
import java.lang.*;
import java.io.*;

class Lucky_Lucky_Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            long n = scan.nextLong();
            boolean result = false;
            for(long i=n;i>=0;i-=4)
            {
                if(i%7==0)
                {
                    System.out.println(i);
                    result=true;
                    break;
                }
            }
            if(!result)
            System.out.println(-1);
        }
	}
}
