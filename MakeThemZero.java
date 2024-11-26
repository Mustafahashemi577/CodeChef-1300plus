import java.util.*;
import java.lang.*;
import java.io.*;

class MakeThemZero
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    long a[] = new long [n];
		    long s = 0;
		    long operation = 0;
		    for(int i=0;i<n;i++){ 
		        a[i]=scan.nextLong();
		        s=s|a[i];
		    }
		    while(s!=0){
		        operation++;
		        s=s&(s-1);
		    }
		    System.out.println(operation);
		}
	}
}
