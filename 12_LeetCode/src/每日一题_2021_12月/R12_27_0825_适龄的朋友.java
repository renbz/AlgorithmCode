package 每日一题_2021_12月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/27 09:18
 * @Description:
 */

public class R12_27_0825_适龄的朋友 {

    public int numFriendRequests(int[] ages) {
        // 计数排序
        int[] cnt = new int[121];
        for (int age : ages) {
            cnt[age]++;
        }
        // 计算前缀和
        int[] preSum = new int[121];
        for (int i = 1; i < 121; i++) {
            preSum[i] = preSum[i - 1] + cnt[i];
        }
        // 计算结果
        int ans = 0;
        for (int i = 15; i <= 120; ++i) {
            if (cnt[i] > 0) {
                int bound = (int) (i * 0.5 + 7);
                ans += cnt[i] * (preSum[i] - preSum[bound] - 1);
            }
        }
        return ans;
    }

}
