import java.util.*;
import java.lang.*;
import java.io.*;

class ChocolateMonger
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int x = scan.nextInt();
            int a[] = new int [n];
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
              a[i]=scan.nextInt();
              set.add(a[i]);
            } 
            if(set.size()==n){
                System.out.println(n-x);
            }
            else{
                if((n-set.size())>x)
                    System.out.println(set.size());
                else{
                    int d = (n-set.size());
                    System.out.println(set.size()-(x-d));
                }
            }
        }
        
	}
}

