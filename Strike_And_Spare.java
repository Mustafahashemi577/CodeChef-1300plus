import java.util.*;
import java.lang.*;
import java.io.*;

class Strike_And_Spare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int p = 1;
		    StringBuilder sb = new StringBuilder("1");
		    for(int i = 0;i<n/2;i++){
		        sb.append("0");
		    }
		    System.out.println(p+" "+sb);
		}
	}
}
