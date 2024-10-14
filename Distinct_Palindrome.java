import java.util.*;
import java.lang.*;
import java.io.*;

class Distinct_Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0)
        {
            int n=scan.nextInt();
            int m=scan.nextInt();
            int x=(int)Math.ceil((double)n/2);
            if(m>x)
            System.out.println("-1");
            else
            {
                ArrayList<Character> a=new ArrayList<>();
                char ch='a';
                int c=1;
                a.add(ch);
                for(int i=1;i<=(n-1)/2;i++)
                {
                    if(c<m)
                    {
                        c++;
                        ch++;
                    }
                    a.add(ch);
                }
                if(n%2==0)
                {
                    for(int i=n/2;i<n;i++)
                    {
                        a.add(a.get(n-1-i));
                    }
                }
                else
                {
                    for(int i=(n/2)+1;i<n;i++)
                    {
                        a.add(a.get(n-1-i));
                    }
                }
                for(int i=0;i<n;i++)
                {
                    System.out.print(a.get(i));
                }
                System.out.println();
            }
        }
	}
}