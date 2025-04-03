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
		    int a[] = new int[n];
		    for (int i = 0 ; i < n ; i++ ) a[i] = scan.nextInt();
		    long sum = 0;
		    int maxOdd = Integer.MIN_VALUE;
		    int minEven = Integer.MAX_VALUE;
		    int minIndex = 0;
		    int maxIndex = 0;
		    for( int i = 0 ; i < n ; i++ ){
		        if( (i & 1) == 0 && Math.abs(a[i]) < minEven ){
		            minEven = (int)Math.abs(a[i]);
		            minIndex = i;
		        }
		        else if( (i & 1) == 1 && Math.abs(a[i]) > maxOdd ){
		            maxOdd = (int)Math.abs(a[i]);
		            maxIndex = i;
		        }
		    }
		    long orSum = 0;
		    for( int i = 0 ; i < n ; i++ ){
		        if( (i & 1) == 0 ){
		            orSum += (int)Math.abs(a[i]);
		        }
		        else{
		            orSum -= (int)Math.abs(a[i]);
		        }
		    }
		    int temp = a[minIndex];
		    a[minIndex] = a[maxIndex];
		    a[maxIndex] = temp;
		    for( int i = 0 ; i < n ; i++ ){
		        if( (i & 1) == 0 ){
		            sum += (int)Math.abs(a[i]);
		        }
		        else{
		            sum -= (int)Math.abs(a[i]);
		        }
		    }
		    System.out.println( (long)Math.max( orSum , sum)  );
		}
	}
}
