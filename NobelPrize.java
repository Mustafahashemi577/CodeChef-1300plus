import java.util.*;
import java.lang.*;
import java.io.*;

class NobelPrize
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int m = scan.nextInt();
            Set <Integer> set = new HashSet<>();
            boolean result = false;
            for(int i = 0;i<n;i++) set.add(scan.nextInt());
            System.out.println(set.size()!=m?"Yes":"No");
        }
	}
}

