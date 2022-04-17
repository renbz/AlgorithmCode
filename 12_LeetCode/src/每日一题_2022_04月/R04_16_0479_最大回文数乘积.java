package 每日一题_2022_04月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/16 17:01
 * @Description:
 */

public class R04_16_0479_最大回文数乘积 {

    public int largestPalindrome(int n) {
        if (n == 1) return 9;
        int upper = (int) Math.pow(10, n) - 1;
        int ans = 0;

        for (int left = upper; ans == 0; left--) { //枚举回文的左边部分
            long p = left;
            for (int x = left; x > 0; x /= 10) {
                p = p * 10 + x % 10; //翻转左半部分到其自身末尾，构造回文数p
            }
            for (long x = upper; x * x >= p; x--) {
                if (p % x == 0) { //x是p的因子
                    ans = (int) (p % 1337);
                    break;
                }
            }
        }
        return ans;
    }

}
