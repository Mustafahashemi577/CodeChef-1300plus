import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_New_Recipe
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a[] = new int [n];
		    boolean result = true;
		    for(int i = 0;i<n;i++) {
		        a[i]=scan.nextInt();
		        if(a[i]==1)
		            result = false;
		    }
		    long sum = 0L;
		    Arrays.sort(a);
		    for(int i = 1;i<n;i++) sum+=a[i];
		    System.out.println(result?sum+2:-1);
		}
	}
}
