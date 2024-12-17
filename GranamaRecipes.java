import java.util.*;
import java.lang.*;
import java.io.*;
class GranamaRecipes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    char [] ch1 = scan.next().toCharArray();
		    char [] ch2 = scan.next().toCharArray();
		    int c=0,cn=0;
		    HashMap<Character,Integer> hm1=new HashMap<>();
		    for(int i=0;i<ch1.length;i++) hm1.put(ch1[i],hm1.getOrDefault(ch1[i],0)+1);
		     HashMap<Character,Integer> hm2=new HashMap<>();
		    for(int i=0;i<ch2.length;i++) hm2.put(ch2[i],hm2.getOrDefault(ch2[i],0)+1);
		    if(hm1.keySet().equals(hm2.keySet())) c=1;
		    if(hm1.equals(hm2)) cn=1;
		    System.out.println(c==cn?"YES":"NO");
		    }
	}
}