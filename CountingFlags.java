import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t--> 0) {
            long n = scan.nextLong();
            long res = 2 * n * (n - 1) * (n - 1) + 
                       n * (n - 1) * (n - 2) + 
                       2 * n * (n - 1) * (n - 2) * (n - 2);
            System.out.println(res);
        }

	}
}

