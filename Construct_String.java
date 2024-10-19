import java.util.*;
import java.lang.*;
import java.io.*;

class Construct_String
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int n = scan.nextInt();
            String s = scan.next();
            int c=0;
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<n;i++)
            {
                while(i<n-1 && s.charAt(i)==s.charAt(i+1))
                {
                    c++;
                    i++;
                }
                if((c+1)%2==0)
                {
                sb.append(s.charAt(i));
                sb.append(s.charAt(i));
                }
                else
                sb.append(s.charAt(i));
                
                c=0;
            }
            System.out.println(sb);
        }
	}
}
