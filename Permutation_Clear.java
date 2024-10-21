import java.util.*;
class Permutation_Clear {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> list1 = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                list1.add(scan.nextInt());
            }
            int k = scan.nextInt();
            for(int i = 0; i < k; i++) {
                int temp = scan.nextInt();
                list1.remove(Integer.valueOf(temp)); 
            }
            for(int i = 0; i < list1.size(); i++) { 
                System.out.print(list1.get(i) + " ");
            }
            System.out.println();
        }
    }
}