package questionAll;

/**
 * @author Ren
 */

public class R0300_最长上升子序列 {

    public int lengthOfLIS(int[] nums) {

        int ans = 1;
        int dp[] = new int[nums.length];
        //初始化数组
        for ( int i = 0; i < dp.length; i++)  dp[i] = 1;

        for ( int j = 0; j < nums.length; j++) {
            for (int k = 0; k < j; k++) {
                if(nums[j]>nums[k]) dp[j] = Math.max(dp[j],dp[k]+1);
                ans = ans>dp[j]?ans:dp[j];
            }
        }
        return ans;
    }

}
