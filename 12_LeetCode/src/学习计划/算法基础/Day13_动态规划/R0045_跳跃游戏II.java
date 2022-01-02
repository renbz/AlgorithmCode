package 学习计划.算法基础.Day13_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 11:24
 * @Description:
 */

public class R0045_跳跃游戏II {

    public int jump(int[] nums) {
        int len = nums.length, end = 0, maxPos = 0, ans = 0;
        for (int i = 0; i < len - 1; i++) {
            maxPos = Math.max(maxPos, i + nums[i]);
            if (i == end) {
                end = maxPos;
                ans++;
            }
        }
        return ans;
    }

}
