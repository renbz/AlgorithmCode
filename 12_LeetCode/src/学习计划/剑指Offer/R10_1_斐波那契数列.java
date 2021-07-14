package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R10_1_斐波那契数列 {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n) {

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
