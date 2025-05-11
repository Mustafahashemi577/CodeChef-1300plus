import java.util.*;
import java.lang.*;
import java.io.*;

class MajinVegeta
{
    public static int counter(int n){
        Set<Integer> factors = new HashSet<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            factors.add(n);
        }
        return factors.size();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n=scan.nextInt();
		    int m=scan.nextInt();
		    int result=0;
		    for(int i=n;i<m;i++){
		        result+= counter(i);
		    }
		    System.out.println(result);
		}
	}
}

