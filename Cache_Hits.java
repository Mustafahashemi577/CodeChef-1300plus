import java.util.*;
import java.lang.*;
import java.io.*;

class Cache_Hits
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int n = scan.nextInt();
	        int b = scan.nextInt();
	        int m = scan.nextInt();
	        int a[] = new int[m];
	        for(int i = 0;i<m;i++) a[i]=scan.nextInt();
	        int loaded=a[0]/b;
	        int number=1;
	        for(int i = 1;i<m;i++){
	            if(loaded!=(a[i]/b)){
	                number++;
	                loaded=a[i]/b;
	            }
	        }
	        System.out.println(number);
	    }
	}
}
