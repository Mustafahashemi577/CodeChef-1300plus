import java.util.*;
import java.lang.*;
import java.io.*;

class CountSubstrings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    char s[] = scan.next().toCharArray();
		    long one=0;
		    for(int i=0;i<n;i++){
		        if(s[i]=='1')
		            one++;
		    }
		    System.out.println((one*(one+1))/2);
		}

	}
}

