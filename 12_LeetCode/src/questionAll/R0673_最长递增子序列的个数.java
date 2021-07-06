package questionAll;

/**
 * @author Ren
 */

public class R0673_最长递增子序列的个数 {

    public int findNumberOfLIS(int[] nums) {
        int ans = 1;
        int dp[] = new int[nums.length];
        int c[] = new int[nums.length];
        //初始化数组
        for (int i = 0; i < dp.length; i++){
            dp[i] = 1;  c[i] = 1;
        }

        for (int j = 0; j < nums.length; j++) {
            for (int k = 0; k < j; k++) {
                if (nums[j] > nums[k]) {
                    dp[j] =Math.max(dp[j], dp[k] + 1);
                    c[j] = c[k] + 1;
                }
                ans = ans > dp[j] ? ans : dp[j];
            }
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i] == ans) count += c[i];
        }
        return count;
    }

}
