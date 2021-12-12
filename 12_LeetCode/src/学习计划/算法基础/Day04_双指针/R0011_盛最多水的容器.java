package 学习计划.算法基础.Day04_双指针;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/11 18:03
 * @Description:
 */

public class R0011_盛最多水的容器 {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i<j){
            res = height[i]<height[j]?Math.max(res,(j-i)*height[i++]):Math.max(res,(j-i)*height[j--]);
        }
        return res;
    }
}
