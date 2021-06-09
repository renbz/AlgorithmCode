package Other;

/**
 * @author Ren
 */

public class R0050_Pow_x_n {
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
