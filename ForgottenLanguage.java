import java.util.*;

class ForgottenLanguage{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            scan.nextLine();
            String[] forget = new String[n];
            for (int i = 0; i < n; i++) {
                forget[i] = scan.next();
            }
            String[] ans = new String[n];
            for (int i = 0; i < n; i++) {
                ans[i] = "NO"; 
            }
            for (int i = 0; i < k; i++) {
                int l = scan.nextInt();
                String[] str = new String[l];
                for (int j = 0; j < l; j++) {
                    str[j] = scan.next();
                }
                for (int a = 0; a < n; a++) {
                    for (int j = 0; j < l; j++) {
                        if (forget[a].equals(str[j])) {
                            ans[a] = "YES"; 
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
