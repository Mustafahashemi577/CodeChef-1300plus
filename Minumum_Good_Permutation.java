import java.util.*;
import java.lang.*;
import java.io.*;

class Minumum_Good_Permutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
            if(n%2==0)
            {
                int s=2;
                for(int i=0;i<n;i+=2)
                {
                    System.out.print(s+" ");
                    System.out.print((s-1)+" ");
                    s+=2;
                }
            }
            else
            {
                int s=2;
                for(int i=0;i<n-3;i+=2)
                {
                    System.out.print(s+" ");
                    System.out.print((s-1)+" ");
                    s+=2;
                }
                System.out.print((n-1)+" "+n+" "+(n-2));
            }
            System.out.println();
		}
	}
}
