package 每日一题_2022_06月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/3 23:06
 * @Description:
 */

public class R06_03_0829_连续整数求和 {

    public int consecutiveNumbersSum(int n) {
        int ans = 0;
        int bound = 2 * n;
        for (int k = 1; k * (k + 1) <= bound; k++) {
            if (isKConsecutive(n, k)) ans++;
        }
        return ans;
    }

    private boolean isKConsecutive(int n, int k) {
        if (k % 2 == 1) {
            return n % k == 0;
        } else {
            return n % k != 0 && 2 * n % k == 0;
        }
    }

}
