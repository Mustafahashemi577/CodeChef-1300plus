import java.util.*;
import java.lang.*;
import java.io.*;

class ChefAndGround
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
		    int n=scan.nextInt();
		    int m=scan.nextInt();
		    int sum=0;
		    for(int i=0;i<n;i++){
		        int temp=scan.nextInt();
		        sum+=temp;
		    }
		    System.out.println((sum+m)%n==0?"Yes":"No");
	    }
	}
}
