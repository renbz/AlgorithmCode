package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R16_数值的整数次方 {
    public double myPow(double x, int n) {
        // 快速幂
        if (x == 1 || n == 0) return 1;
        double result = 1;
        long b = n;
        if (b < 0) {
            b = -b;
            x = 1 / x;
        }
        while (b != 0) {
            if ((b & 1) == 1) result *= x;
            b >>= 1;
            x *= x;
        }
        return result;
    }
}
