import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_In_Heanven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int l = scan.nextInt();
		    char s[] = scan.next().toCharArray();
		    boolean result=false;
		    int ones=0, zeros=0;
		    for(int i = 0;i<l;i++){
		        if(s[i]=='1')
		        ones++;
		        else
		        zeros++;
		        if(i%2==0&&ones>=((i+1)/2)+1&&ones!=0){
		            result = true;
		            break;
		        }
		        if(i%2==1&&ones>=((i+1)/2)&&ones!=0){
		            result=true;
		            break;
		        }
		    }
		    System.out.println(result==true?"YES":"NO");
		}
	}
}
