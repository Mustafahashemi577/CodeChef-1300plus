import java.util.*;
import java.lang.*;
import java.io.*;

class CricketScore
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int r[] = new int [n];
		int w[] = new int [n];
		boolean result = true;
		int run = -1, wicket = -1;
		for(int i = 0;i<n;i++){
		    r[i]=scan.nextInt();
		    w[i]=scan.nextInt();
		    if(r[i]<run || w[i]<wicket || wicket ==10){
		        result=false;
		    }
		    run=r[i];
		    wicket=w[i];
		}
		System.out.println(result?"YES":"NO");
	}
}
