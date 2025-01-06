import java.util.*;
import java.lang.*;
import java.io.*;

class CookingMachine
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(a==b)
                System.out.println("0");
            else{
                int count = 0;
                while(b%a!=0){
                    a/=2;
                    count++;
                }
                while(b!=a){
                    a*=2;
                    count++;
                }
                System.out.println(count);
            }
        }
	}
}

