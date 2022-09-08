package 每日一题_2022_09月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/9/8 23:28
 * @Description:
 */

public class R09_08_0667_优美的排列II {

    public int[] constructArray(int n, int k) {
        int[] answer = new int[n];
        int idx = 0;
        for (int i = 1; i < n - k; ++i) {
            answer[idx] = i;
            ++idx;
        }
        for (int i = n - k, j = n; i <= j; ++i, --j) {
            answer[idx] = i;
            ++idx;
            if (i != j) {
                answer[idx] = j;
                ++idx;
            }
        }
        return answer;
    }

}
