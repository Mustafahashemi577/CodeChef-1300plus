import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int n = scan.nextInt();
	        int k = scan.nextInt();
	        int a[] = new int[n];
	        for(int i = 0;i<n;i++)
	            a[i]=scan.nextInt();
	        Arrays.sort(a);
	        long min = Long.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    min = Math.min(Math.abs(a[i] + a[j] - k), min);
                }
            }
	        int count=0;
		    for(int i=0;i<n;i++){
		        for(int j=i+1;j<n;j++){
		            int val=Math.abs((a[i]+a[j])-k);
		            if(val==min) count++;
		       }
		   }
		   System.out.println(Math.abs(min)+" "+ count);
	    }
	}
}

