package java_2013_B;

/**
 * @author Ren
 */
import java.util.*;
public class Main010_连号区间数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long ans = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int k = j; k < n; k++) {
                if (a[k] > max) max = a[k];
                if (a[k] < min) min = a[k];
                if (max - min == k - j) ans++;
            }
        }
        System.out.println(ans);
    }
}