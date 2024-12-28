import java.util.*;
import java.lang.*;
import java.io.*;

class CopsAndTheThiefDevu
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int m = scan.nextInt();
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int ma[] = new int [m];
		    for(int i = 0;i<m;i++){
		        ma[i]=scan.nextInt();
		    }
		    boolean safe[] = new boolean[100];
		    for(int i = 0;i<100;i++) safe[i]=true;
            for(int cop : ma){
                int st = Math.max(1,cop-(x*y));
                int en = Math.min(100, cop+x*y);
                for(int i = st;i<=en;i++)
                    safe[i-1]=false;
            }		    
		    int count = 0;
		    for(boolean temp : safe)
		        if(temp)
		        count++;
		        
		    System.out.println(count);
		}

	}
}

