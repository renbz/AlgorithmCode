package 学习计划.算法.算法基础.Day05_滑动窗口;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/11 18:11
 * @Description:
 */

public class R0713_乘积小于K的子数组 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int l = 0,r = 0;
        int ans = 0;
        int base = 1;
        while(r < nums.length){
            base *= nums[r];
            while(base >= k) base /= nums[l++]; //当l=r时就为1了，是小于k的不会越界
            // 每一次循环找的是以r为右边界的子数组，r一直在变，所以一定不重复
            // 比如5，2，6此时满足条件，此时右边界为6，要找的数组就是[5,2,6],[2,6],[6]
            ans += r-l+1;
            r++;
        }
        return ans;
    }
}
