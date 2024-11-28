import java.util.*;
import java.lang.*;
import java.io.*;

class YetAnotherPalindromeMakingProblem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0)
        {
            int n=scan.nextInt();
            String s=scan.next();
            
            String s1="",s2="";
            for(int i=0;i<n;i++)
            {
                char ch=s.charAt(i);
                if(i%2==0)
                s1+=ch;
                else
                s2+=ch;
            }
            char c1[]=s1.toCharArray();
            char c2[]=s2.toCharArray();
            boolean f=true;
            Arrays.sort(c1);
            Arrays.sort(c2);
            for(int i=0;i<s1.length();i++)
            {
                if(c1[i]==c2[i])
                continue;
                else
                {
                    f=false;
                }
            }
            if(f)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
	}
}
