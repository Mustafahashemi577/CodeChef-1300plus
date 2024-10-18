import java.util.*;
import java.lang.*;
import java.io.*;

class Anti_Adjacent_Swaps
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
		    int n = scan.nextInt();
		    int a[] = new int[n];
		    for(int i = 0; i < n; i++) {
		        a[i] = scan.nextInt();
		    }
		    if(n == 1 || n > 3) {
		        System.out.println("YES");
		    }
		    else if(n == 2 && a[0] <= a[1]) {
		        System.out.println("YES");
		    }
		    else if(n == 3) {
		        int mx = Math.max(a[0] , a[2]);
		        int mn = Math.min(a[0] , a[2]);
		        a[0] = mn; a[2] = mx;
		        
		        if(a[0] <= a[1] && a[1] <= a[2]) {
		            System.out.println("YES");
		        }
		        
		        else {
		            System.out.println("NO");
		        }
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
