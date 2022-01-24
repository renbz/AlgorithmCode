package 学习计划.剑指Offer专项突击版.Day03_04_数组;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/23 17:28
 * @Description:
 */

public class 剑指OfferII_009_乘积小于K的子数组 {

    /**
     * 关于 ans 为什么要 + (r-l+1)
     * 因为每次获取一个乘积小于k的区间，假设区间有n个数，每次包含最右端的那个数的子串 都是新的子数组
     * 比如     456789 找出小于9999999的数 第一次4   第二次45->45,5  第三次  456——> 456,56,6
     * 第四次4567——> 4567,567,67,7  第五次45678——> 45678,5678,678,78,8
     * @param nums
     * @param k
     * @return
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int len = nums.length, l = 0, r = 0, ans = 0, base = 1;
        while (r < len) {
            base *= nums[r];
            while (base >= k) {
                base /= nums[l];
                l++;
            }
            ans += r - l + 1;
            r++;
        }
        return ans;
    }

}
