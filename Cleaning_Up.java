import java.util.*;
import java.lang.*;
import java.io.*;

class Cleaning_Up
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    List<Integer> list1 = new ArrayList<>();
		    List<Integer> list2 = new ArrayList<>();
		    for(int i = 0;i<m;i++)
		        list1.add(scan.nextInt());
		    for(int i = 1;i<=n;i++)
		        if(!list1.contains(i))
		            list2.add(i);
		    
		    String chef="", assistant="";
		    for(int i = 0;i<list2.size();i++){
		        if(i%2==0)
		        chef +=list2.get(i)+" ";
		        else
		        assistant+=list2.get(i)+" ";
		    }
		    System.out.println(chef==""?-1:chef);
		    System.out.println(assistant==""?-1:assistant);
		}
	}
}
