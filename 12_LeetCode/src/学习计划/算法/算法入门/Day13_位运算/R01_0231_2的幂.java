package 学习计划.算法.算法入门.Day13_位运算;

/**
 * @author Ren
 */

public class R01_0231_2的幂 {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n - 1) ^ n) == 0;
    }

}
