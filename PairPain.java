import java.util.*;
import java.lang.*;
import java.io.*;

class PairPain
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-->0){
		    int n = scan.nextInt();
		    long a[] = new long [n];
		    long c1=1,c2=0;
            long s=0;
            for(int i=0;i<n;i++)
            {
                a[i]=scan.nextLong();
                if(a[i]==1)
                {
                    s+=n-c1;
                c1++;
                }
                else if(a[i]==2)
                c2++;
            }
            
            s+=c2*(c2-1)/2;
            System.out.println(s);
		}
	}
}
