package 每日一题_2022_03月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/27 14:00
 * @Description:
 */

public class R03_27_2028_找出缺失的观测数据 {

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sum = Arrays.stream(rolls).sum();
        int totalSum = (m + n) * mean;
        int need = totalSum - sum;
        if (need > n * 6 || need < n) return new int[]{};
        int[] ans = new int[n];
        int num = need / n;
        int num2 = need % n;
        for (int i = 0; i < num2; i++) {
            ans[i] = num + 1;
        }
        for (int i = num2; i < n; i++) {
            ans[i] = num;
        }
        return ans;
    }

}
