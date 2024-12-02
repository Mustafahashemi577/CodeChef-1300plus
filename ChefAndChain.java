import java.util.*;
import java.lang.*;
import java.io.*;

class ChefAndChain
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            String s = scan.next();
            int n = s.length();
            int c1 = 0;
            for (int i=0; i<n; i++)
            {
                if (i%2==0 && s.charAt(i)=='-') c1++;
                else if (i%2!=0 && s.charAt(i)=='+') c1++;
            }
            int c2 = 0;
            for (int j=0; j<n; j++)
            {
                if (j%2==0 && s.charAt(j)=='+') c2++;
                else if (j%2!=0 && s.charAt(j)=='-') c2++;
            }
            System.out.println(Math.min(c1,c2));
        }
	}
}
