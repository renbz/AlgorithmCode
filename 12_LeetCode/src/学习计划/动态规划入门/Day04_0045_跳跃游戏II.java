package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/8 22:05
 * @Description:
 */

public class Day04_0045_跳跃游戏II {

    public int jump(int[] nums) {
        int len = nums.length, end = 0, ans = 0, maxPoint = 0;
        for (int i = 0; i < len; i++) {
            maxPoint = Math.max(maxPoint, i + nums[i]);
            if (i == end) {
                end = maxPoint;
                ans++;
            }
        }
        return ans;
    }

}
