package java_2014_B;

import java.util.Scanner;

public class Main008_分糖果 {
    static int sum1, sum2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            sum1 += a[i];
        }
        while (!Allequals(a)) {
            for (int i = 0; i < n; i++)
                a[i] = a[i] / 2;
            int a0 = a[0];
            for (int i = 0; i < n - 1; i++)
                a[i] += a[i + 1];
            a[n - 1] += a0;
            for (int i = 0; i < n; i++)
                if (a[i] % 2 == 1) a[i]++;
        }
        for (int i = 0; i < n; i++) sum2 += a[i];
        System.out.println(sum2 - sum1);
    }

    public static boolean Allequals(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[0]) {
                return false;
            }
        }
        return true;
    }
}