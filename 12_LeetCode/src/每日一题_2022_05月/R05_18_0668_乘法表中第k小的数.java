package 每日一题_2022_05月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/18 21:11
 * @Description:
 */

public class R05_18_0668_乘法表中第k小的数 {

    public int findKthNumber(int m, int n, int k) {
        int left = 1, right = m * n;
        while (left < right) {
            int x = left + (right - left) / 2;
            int count = x / n * n;
            for (int i = x / n + 1; i <= m; ++i) {
                count += x / i;
            }
            if (count >= k) {
                right = x;
            } else {
                left = x + 1;
            }
        }
        return left;
    }

}
