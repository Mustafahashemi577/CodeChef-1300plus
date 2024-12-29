import java.util.*;
import java.lang.*;
import java.io.*;

class MagicalDoors
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String s = scan.next();
		    int count = 0;
		    if(s.charAt(0)=='0')
		        count++;
		    for(int i = 1;i<s.length();i++){
		        if(s.charAt(i)!=s.charAt(i-1))
		        count++;
		    }
		    System.out.println(count);
		}

	}
}

