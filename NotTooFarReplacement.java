import java.util.*;
import java.lang.*;
import java.io.*;

class NotTooFarReplacement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
		    int n=scan.nextInt();
		    int []arr=new int[n];
		    long sum=0;
		   
		    for(int i=0;i<n;i++)
		      arr[i]=scan.nextInt();
		      
		    int last=scan.nextInt();
		   
		   Arrays.sort(arr);
		   for(int i=0;i<n;i++){
		       if(arr[i]<=2*last && arr[i]>last){
		           int temp=arr[i];
		           arr[i]=last;
		           last=temp;
		       }
		   }
		   
		   for(int i:arr)
		     sum+=i;
		     
		    System.out.println(sum);
		   
        }
	}
}
