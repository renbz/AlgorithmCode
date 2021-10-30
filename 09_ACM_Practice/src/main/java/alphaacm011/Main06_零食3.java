package alphaacm011;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main06_零食3 {
    static int l, r, n, ans;
    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n+1];
        for (int i = 1; i <= n; i++)
            arr[i] = in.nextInt();
        l = in.nextInt();
        r = in.nextInt();
        dfs(1, 1, 8);
        System.out.println(Math.abs(ans));
    }

    static void dfs(int p, int sum, int base) {
        if (base > r) return;
        if(sum>n) return;
        if(sum%2==0) ans += ((r) / base) - (l - 1) / base;
        else ans -= (r / base - (l - 1) / base);
        for (int i = p; i <= n; i++) {
            dfs(i + 1, sum + 1, lcm(base, arr[i]));
        }
    }
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}