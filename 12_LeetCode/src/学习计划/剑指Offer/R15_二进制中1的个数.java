package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R15_二进制中1的个数 {

    public int hammingWeight(int n) {

        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

}
