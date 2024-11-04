import java.util.*;
import java.lang.*;
import java.io.*;

class The_Best_Box
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    double p=scan.nextDouble();
            double s=scan.nextDouble();
            double b=(p-Math.sqrt(p*p-24*s))/12;
            double l=(p-8*b)/4;
            System.out.println((float)l*b*b);    
		}
	}
}
