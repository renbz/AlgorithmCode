package AlphaACM.match02;

/**
 * @author Ren
 */

import java.util.*;

public class Main_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), p = in.nextInt();
        int[] a = new int[3000005];

        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            for (int j = t - p; j <= t + p; j++) {
                a[j + 1000000]++;
            }
        }
        int max = -1000000;
        for (int i = 0; i < a.length; i++) {
            max = max > a[i] ? max : a[i];
        }
        System.out.println(max);
    }

}
