package 美团; /**
 * @author Ren
 */

import java.util.Scanner;
import java.util.TreeSet;

public class Main04_小美当会计 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        int [] sum = new int[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum[i+1] = a[i]+sum[i];
        }
        int k =in.nextInt();
        while (k-->0){
            int q = in.nextInt();
            int l = in.nextInt();
            int r = in.nextInt();

            if(q==1){
                System.out.println(sum[r] - sum[l-1]);
            }
            if(q==2){
                // 1-r  b[i] 求和
                int t = sum[r]-sum[l-1];
                long res = 0;
                for (int i = l-1; i < r; i++) {
                    res += (long) Math.pow(t-a[i],2);
                }
                System.out.println(res);
            }
            if(q==3){
                int max = Integer.MIN_VALUE;
                for (int i = l-1; i < r; i++) {
                    max = max>a[i]?max:a[i];
                }
                System.out.println(max);
            }

        }
    }
}
