import java.util.*;
import java.lang.*;
import java.io.*;

class Tickets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String s = scan.next();
		    Set<Character> set = new HashSet<>();
		    boolean flag = true;
		    for(int i = 0;i<s.length();i++)
		        set.add(s.charAt(i));
		    System.out.println(set.size()==2?"YES":"NO");
		}
	}
}
