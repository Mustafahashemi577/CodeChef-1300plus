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
	        int n = scan.nextInt();
	        int a[] = new int [n];
	        int b[] = new int [n];
	        for(int i = 0;i<n;i++)
	            a[i]=scan.nextInt();
	        for(int i = 0;i<n;i++)
	            b[i]=scan.nextInt();
	        List < int[] > intervals = new ArrayList < > ();
            for (int i = 0; i < n; i++) {
                intervals.add(new int[] {
                    a[i], b[i]
                });
            }

            intervals.sort(Comparator.comparingInt(o -> o[0]));

            int answer = 1;
            for (int i = 0; i < n; i++) {
                int start = intervals.get(i)[0];
                int end = intervals.get(i)[1];

                for (int j = start; j < end; j++) {
                    int count = 0;
                    for (int k = 0; k < n; k++) {
                        int intervalStart = intervals.get(k)[0];
                        int intervalEnd = intervals.get(k)[1];
                        if (intervalStart <= j && intervalEnd > j) {
                            count++;
                        }
                    }
                    answer = Math.max(answer, count);
                }
            }

            System.out.println(answer);
	    }

	}
}

