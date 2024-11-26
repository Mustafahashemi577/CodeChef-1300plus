import java.util.*;
import java.lang.*;
import java.io.*;

class ProblemDifficulties
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0){
		   int a[] = new int[4];
		   for(int i = 0; i < 4; i++) a[i] = scan.nextInt();
		   Arrays.sort(a);
		   if(a[0] == a[3])
		       System.out.println(0);
		   else if(a[1] != a[2] || a[1] == a[2] && a[1] != a[0] && a[2] != a[3])
		       System.out.println(2);
		    else 
		       System.out.println(1);
		}
	}
}
