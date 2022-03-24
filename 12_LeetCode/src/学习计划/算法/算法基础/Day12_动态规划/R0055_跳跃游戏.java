package 学习计划.算法.算法基础.Day12_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 11:24
 * @Description:
 */

public class R0055_跳跃游戏 {

    public boolean canJump(int[] nums) {
        int mostPos = 0;
        for (int i = 0; i < Math.min(nums.length,mostPos+1); i++) {
            mostPos = Math.max(mostPos,i+nums[i]);
        }
        return mostPos>=nums.length-1;
    }

}
