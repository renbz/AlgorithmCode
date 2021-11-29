package AlphaACM.match02;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main_B_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), p = in.nextInt();
        int a[] = new int[1000005];
        int sum[] = new int[1000005];
        for (int i = 0; i < n; i++) a[in.nextInt()]++;
        for (int i = 1; i < 1000005; i++) sum[i] = sum[i - 1] + a[i];
        int max = 0;
        for (int i = p + 1; i < 1000005-p; i++) max = Math.max(max, sum[i + p] - sum[i - p - 1]);
        System.out.println(max);
    }
}