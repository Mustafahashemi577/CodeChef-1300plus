import java.util.*;
import java.lang.*;
import java.io.*;
class Pairing_Chefs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    Pair a[] = new Pair[m];
		    for(int i=0; i<m; i++) {
		        int x = scan.nextInt();
		        int y = scan.nextInt();
		        a[i] = new Pair(x,y);
		    }
		    boolean result[] = new boolean[n];
		    Arrays.fill(result, false);
		    ArrayList<Integer> ans = new ArrayList<>();
		    for(int i=m-1; i>=0; i--) {
		        Pair temp = a[i];
		        if(!result[temp.first] && !result[temp.second]) {
		            ans.add(i);
		            result[temp.first] = true;
		            result[temp.second] = true;
		        }
		    }
		    for(int i=ans.size() - 1; i>=0; i--) 
		    System.out.print(ans.get(i) + " ");
		    System.out.println();
		}
	}
	static class Pair {
	    int first;
	    int second;
	    public Pair(int first, int second) {
	        this.first = first;
	        this.second = second;
	    }
	}
}