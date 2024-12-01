import java.util.*;
import java.lang.*;
import java.io.*;

class DivisibleByK
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            long k = scan.nextLong();
            long a[] = new long [n];
            boolean result = false;
            for(int i = 0;i<n;i++) a[i]=scan.nextLong();
            long temp = a[0];
            for(int i = 1;i<n;i++){
                temp=temp*a[i];
                if(temp%k==0){
                    result=true;
                    System.out.println("YES");
                    break;
                }
                temp = temp%k;
            }
            if(!result)
            System.out.println("NO");
        }
    }
}
