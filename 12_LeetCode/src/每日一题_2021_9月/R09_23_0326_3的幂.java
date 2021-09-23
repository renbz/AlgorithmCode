package 每日一题_2021_9月;

/**
 * @author Ren
 */

public class R09_23_0326_3的幂 {
    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
