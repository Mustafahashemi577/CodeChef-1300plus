import java.util.*;
import java.lang.*;
import java.io.*;

class DaanishAndProblems
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a[] = new int[10];
		    for(int i = 0;i<10;i++){
		        a[i]=scan.nextInt();
		    }
		    long k = scan.nextLong();
		    int i = 9;
		    for(;i>=0;i--){
		        if(a[i]<=k){
		            k-=a[i];
		        }
		        else{
		            break;
		        }
		    }
		    System.out.println(++i);
		}

	}
}

