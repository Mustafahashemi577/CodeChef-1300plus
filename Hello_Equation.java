import java.util.*;
import java.lang.*;
import java.io.*;

class Hello_Equation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
            int n=scan.nextInt();
            if(n<5)
            System.out.println("NO");
            else
            {
                boolean result=false;
                for(int i=1;i<Math.sqrt(n);i++)
                {
                    if((n-2*i)%(i+2)==0)
                    {
                        result=true;
                        break;
                    }
                }
                System.out.println(result?"YES":"NO");
            }
        }
	}
}
