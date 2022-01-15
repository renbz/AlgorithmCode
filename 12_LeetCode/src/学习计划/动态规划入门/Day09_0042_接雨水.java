package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/14 15:06
 * @Description:
 */

public class Day09_0042_接雨水 {

    public int trap(int[] height) {
        int leftMax = -1, rightMax = -1, len = height.length, sum = 0, hMin = 0;
        int l = 0, r = len - 1;
        while (l < r) {
            int t = hMin;
            leftMax = leftMax >= height[l] ? leftMax : height[l];
            rightMax = rightMax >= height[r] ? rightMax : height[r];
            hMin = Math.min(leftMax, rightMax);
            sum += (r - l + 1) * (hMin - t);
            // 谁小移动谁
            while (leftMax == hMin && height[l] <= hMin && l < r) l++;
            while (rightMax == hMin && height[r] <= hMin && l < r) r--;
        }
        for (int i : height) {
            i = i > hMin ? hMin : i;
            sum -= i;
        }
        return sum;
    }

}
