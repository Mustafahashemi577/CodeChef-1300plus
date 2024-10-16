import java.util.*;
import java.lang.*;
import java.io.*;

class The_Ball_And_Cups
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int c = scan.nextInt();
            int q = scan.nextInt();
            while(q-->0){
                int left = scan.nextInt();
                int right = scan.nextInt();
                if(c>=left && c<=right)
                    c=left+right-c;
            }
            System.out.println(c);
        }
	}
}
