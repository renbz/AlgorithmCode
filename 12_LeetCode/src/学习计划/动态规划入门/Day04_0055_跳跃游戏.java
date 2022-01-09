package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/8 21:58
 * @Description:
 */

public class Day04_0055_跳跃游戏 {

    public boolean canJump(int[] nums) {

        int maxTarget = 0, index = 0;
        while (index <= maxTarget && index < nums.length) {
            maxTarget = Math.max(maxTarget, index + nums[index]);
            index++;
        }
        return maxTarget >= nums.length;
    }
}
