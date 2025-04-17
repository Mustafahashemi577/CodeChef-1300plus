import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            boolean right = false;
            int n = scan.nextInt();
            scan.nextLine();
            String a[] = new String[n];
            for(int i = 0;i<n;i++){
                a[i]=scan.nextLine();
            }
            String temp = a[n-1];
            if(temp.contains("Right"))
                right=true;
            if(right)
                temp=temp.replace("Right","Begin");
            else
                temp=temp.replace("Left","Begin");
            System.out.println(temp);
            String c = "";
            for(int i = n-2;i>=0;i--){
                c=a[i];
                if(i==0){
                    if(right)
                        System.out.println(c.replace("Begin","Left"));
                    else
                        System.out.println(c.replace("Begin","Right"));
                }
                else{
                if(right){
                    if(c.contains("Right"))
                        System.out.println(c.replace("Right","Left"));
                    else
                        System.out.println(c);
                }
                else{
                    if(c.contains("Left"))
                        System.out.println(c.replace("Left","Right"));
                    else
                        System.out.println(c);
                }
                }
                if(c.contains("Right"))
                    right=true;
                else
                    right=false;
            }
            System.out.println("");
        }
	}
}

