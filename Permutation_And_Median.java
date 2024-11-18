import java.util.*;
import java.lang.*;
import java.io.*;

class Permutation_And_Median
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0)
        {
            int n=scan.nextInt();
            int h=n;
            int l=1;
            if(n%2==0)
            {
                for(int i=1;i<=n;i+=2)
                {
                    System.out.print(h+" "+l+" ");
                    h--;
                    l++;
                }
            }
            else
            {
                for(int i=1;i<n;i+=2)
                {
                    System.out.print(h+" "+l+" ");
                    h--;
                    l++;
                }
                System.out.print(h+" ");
            }
            System.out.println();
        }
	}
}
