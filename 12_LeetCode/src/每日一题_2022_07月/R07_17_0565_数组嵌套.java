package 每日一题_2022_07月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/17 14:58
 * @Description:
 */

public class R07_17_0565_数组嵌套 {

    public int arrayNesting(int[] nums) {
        int ans = 0, n = nums.length;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            while (!vis[i]) {
                vis[i] = true;
                i = nums[i];
                ++cnt;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }

}
