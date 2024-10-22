import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Approximately
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while (t-->0)
        {
            int k = scan.nextInt();
            int a= 103993;
            int b= 33102;
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<=k; i++)
            {
                if (i==1) sb.append(".");
                sb.append(a/b);
                a = (a%b)*10;
            }
            System.out.println(sb);
        }

	}
}
