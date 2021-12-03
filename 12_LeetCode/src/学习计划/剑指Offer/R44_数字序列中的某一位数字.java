package 学习计划.剑指Offer;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/3 11:23
 * @Description:
 */

public class R44_数字序列中的某一位数字 {

    public int findNthDigit(int n) {
        /**
         * 已知 x 位数共有 9×10^(x−1) 个,所有 x 位数的位数之和是 x 9×10^(x−1)
         */

        // d代表当前数的位数  count当前位数下的所有整数的位数之和
        int d = 1, count = 9;
        while (n > (long) d * count) {
            n -= d * count;
            d++;
            count *= 10;
        }
        int start = (int) Math.pow(10, d - 1);
        int num = start + (n - 1) / d;
        return String.valueOf(num).charAt((n - 1) % d) - '0';
    }
}
