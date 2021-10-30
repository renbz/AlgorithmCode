package alphaacm011;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main06_零食2 {
    static int a, b, n, ans;
    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        dfs(0, 0, 8);
        System.out.println(ans);
    }

    static void dfs(int x, int p, int t) {
        if (t > b) return;
        if (x % 2 == 0) ans += b / t - a / t;
        else ans -= b / t - a / t;
        for (int i = p + 1; i <= n; i++) {
            dfs(x + 1, i, lcm(t, arr[i - 1]));
        }
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}