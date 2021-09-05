package 每日一题_2021_9月;

/**
 * @author Ren
 */

public class R09_04_剑指Offer_10_1_斐波那契数列 {

    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 1;
        for (int i = 2; i <= n; i++) {
            c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return c;
    }
}
