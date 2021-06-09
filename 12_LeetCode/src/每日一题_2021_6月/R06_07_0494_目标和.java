package 每日一题_2021_6月;

/**
 * @author Ren
 */

public class R06_07_0494_目标和 {

    int count = 0;

    public int findTargetSumWays1(int[] nums, int target) {
        // 深度优先搜索  时间复杂度2的n次方
        dfs(nums, target, 0, 0);
        return count;
    }

    public void dfs(int[] nums, int target, int k, int res) {
        if (k == nums.length) {
            if (res == target) count++;
            return;
        }

        // +操作
        res += nums[k];
        dfs(nums, target, k + 1, res); // 递归
        res -= nums[k]; //回溯
        // -操作
        res -= nums[k];
        dfs(nums, target, k + 1, res); // 递归
        res += nums[k]; //回溯
    }


    /**
     * 方法二：   -- 动态规划
     *
     * @param nums
     * @param target
     * @return
     */
    public int findTargetSumWays2(int[] nums, int target) {
        /**
         * 令 nums 数组的总和为sum,则sum-target为 正负抵消掉的部分  res = (sum - target)/2 为正负抵消部分各自的和
         * 所以只需使用背包问题找出能够
         * 凑出来和为res的数值部分   在实际计算中应用 -，剩余部分应用 +，从而实现凑出来原问题的 target 值。
         */

        int sum = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int res = (sum - target) / 2;


        if (sum < target || (sum - target) % 2 == 1) {
            return 0;
        }

        // 动态规划寻找哪些数的和为res，dp[][]的值为方案数
        int dp[][] = new int[n + 1][res + 1];
        dp[0][0] = 1; //初始化数组
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= res; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= nums[i - 1])
                    dp[i][j] += dp[i - 1][j - nums[i - 1]];
            }
        }
        return dp[n][res];
    }


    /**
     * 方法三: -- 优化成以为数组
     *
     * @param nums
     * @param target
     * @return
     */
    public int findTargetSumWays(int[] nums, int target) {
        /**
         * 令 nums 数组的总和为sum,则sum-target为 正负抵消掉的部分  res = (sum - target)/2 为正负抵消部分各自的和
         * 所以只需使用背包问题找出能够
         * 凑出来和为res的数值部分   在实际计算中应用 -，剩余部分应用 +，从而实现凑出来原问题的 target 值。
         *
         *
         * 在二维数组的基础上 优化成以为数组
         */

        int sum = 0, n = nums.length, tmp = 0;
        for (int i = 0; i < n; i++) sum += nums[i];
        int res = (sum - target) / 2;
        if (sum < target || (sum - target) % 2 == 1) return 0;
        // 动态规划寻找哪些数的和为res，dp[][]的值为方案数
        int dp[] = new int[res + 1];
        dp[0] = 1; //初始化数组
        for (int i = 1; i <= n; i++) {
            tmp = nums[i - 1];
            for (int j = res; j >= 0; j--) {
                if (j >= tmp) dp[j] += dp[j - tmp];
            }
        }
        return dp[res];
    }
}