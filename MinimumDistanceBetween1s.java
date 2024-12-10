import java.util.*;
import java.lang.*;
import java.io.*;

class MinimumDistanceBetween1s
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while (t-->0)
		{
		    int n = scan.nextInt();
		    String s = scan.next();
		    ArrayList<Integer> list = new ArrayList<>();
		    Outerloop:
		    for (int i=0; i<n-1; i++)
		    {
		        if (s.charAt(i)=='1')
		        {
		            int dis = 1;
		            i++;
		            while (i<n && s.charAt(i)=='0')
		            {
		                if (i==n-1) break Outerloop;
		                else
		                {
		                    dis++;
		                    i++;
		                }
		            }
		            list.add(dis);
		            i--;
		        }
		    }
		    boolean result = false;
		    for (int obj : list)
		        if (obj%2!=0) 
		            result = true;
		    System.out.println(result?"1":"2");
		}
	}
}
