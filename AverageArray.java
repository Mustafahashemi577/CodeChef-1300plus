import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while( t-- > 0 ){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    ArrayList<Integer> list = new ArrayList<>();
		    int start = x - n / 2;
		    int end = x + n / 2;
		    for (int i = start ; i <=end ; i++ ){
		        if(i==x)
		            continue;
		        list.add(i);
		    }
		    if( (n & 1) == 1  ) list.add( x );
		    System.out.println( list.toString().replace( "," , "" ).replace("[","").replace("]","") );
		}
	}
}

