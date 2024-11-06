import java.util.*;
import java.lang.*;
import java.io.*;

class Another_Good_String
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0){
		    int n = scan.nextInt();
		    int q = scan.nextInt();
		    String s = scan.next();
		    StringBuilder sb = new StringBuilder(s);
		    while(q-->0){
		        sb.append(scan.next().charAt(0));
		    }
		    s = sb.toString();
		    int max = -1;
		    int maxEnd = -1;
		    int count  = 1;
		    if(n == 1) System.out.print(1+" ");
		    for(int i = 1;i<s.length();i++){
		        if(s.charAt(i) == s.charAt(i-1)){
		            count++;
		        }else{
		            count = 1;
		        }
		        max = Math.max(count,max);
		        if(i+1>= n){
		           System.out.print(max+" ");
		        }
		    }
		    System.out.println();
		}
	}
}
