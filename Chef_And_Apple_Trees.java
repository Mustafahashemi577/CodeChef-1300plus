import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Apple_Trees
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int n=scan.nextInt();
		    Set<Integer>s=new HashSet<>();
		    for(int i=0;i<n;i++)
		        s.add(scan.nextInt());
		    System.out.println(s.size());
		}
        
	}
}
