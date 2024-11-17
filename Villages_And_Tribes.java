import java.util.*;
import java.lang.*;
import java.io.*;

class Villages_And_Tribes
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        while(t-- > 0) {
            int[] arr = new int[2];
            String s = scan.nextLine();
            int k = s.length();
            int c = 0, i = 0;
            while(i < k && s.charAt(i) == '.') {
                i++;
            }
            if (i == k) {
                System.out.println(0+" "+0);
            }
            else{
                char f = s.charAt(i);
                arr[f - 'A']++;

                for (int j = i + 1; j < k; j++) {
                    char x = s.charAt(j);
                    if (x == '.') {
                        c++;
                    } else {
                        if (x == f) {
                            arr[x - 'A'] += (c + 1);
                        }
                        else{
                            arr[x-'A']++;
                        }
                        c = 0;  
                        f = x;  
                    }
                }
                System.out.print(arr[0] + " ");
                System.out.println(arr[1]);
            }
        }
    }
}
