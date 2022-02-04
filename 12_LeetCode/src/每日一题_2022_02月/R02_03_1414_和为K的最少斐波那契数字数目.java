package 每日一题_2022_02月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/3 17:38
 * @Description:
 */

public class R02_03_1414_和为K的最少斐波那契数字数目 {

    public int findMinFibonacciNumbers(int k) {
        int a = 1, b = 1;
        while (b <= k) {
            int c = a + b;
            a = b;
            b = c;
        }
        int ans = 0;
        while (k != 0) {
            if (k >= b) {
                k -= b;
                ans++;
            }
            int c = b - a;
            b = a;
            a = c;
        }
        return ans;
    }

}
