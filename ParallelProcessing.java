import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0 ){
		    int n = scan.nextInt();
		    long a[] = new long[n];
		    for (int i = 0 ; i < n ; i++ ) a[i] = scan.nextLong();
		    if( n == 1 )
		        System.out.println(a[0]);
		    else if( n == 2 )
		        System.out.println( Math.max(a[0],a[1]));
		    else{
		        long a1 = a[0];
    		    long a2 = a[n-1];
    		    int i = 1;
    		    int j = n-2;
    		    while( i <= j ){
    		        if( a1 <= a2 ){
    		            a1 += a[i];
    		            i++;
    		        }
    		        else{
    		            a2 += a[j];
    		            j--;
    		        }
    		    }
                System.out.println( Math.max( a1 , a2 ) );
		    }
		}
	}
}

