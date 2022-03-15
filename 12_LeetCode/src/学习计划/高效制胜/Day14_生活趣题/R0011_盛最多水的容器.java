package 学习计划.高效制胜.Day14_生活趣题;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/15 09:37
 * @Description:
 */

public class R0011_盛最多水的容器 {

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, ans = 0;
        while (l < r) {
            ans = height[l] < height[r] ? Math.max(ans, (r - l) * height[l++]) : Math.max(ans, (r - l) * height[r--]);
        }
        return ans;
    }
}
