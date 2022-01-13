package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/9 12:18
 * @Description:
 */

public class Day06_0152_乘积最大子数组 {

    public int maxProduct(int[] nums) {
        int length = nums.length;
        int[] maxF = new int[length];
        int[] minF = new int[length];//以第i个元素结尾的乘积最小子数组的乘积
        System.arraycopy(nums, 0, maxF, 0, length);//nums从0开始的位置复制到maxF从0开始的位置,长度length
        System.arraycopy(nums, 0, minF, 0, length);//对数组进行深拷贝,不能简单的使用数组的引用(浅拷贝)
        for (int i = 1; i < length; i++) {
            maxF[i] = Math.max(nums[i], Math.max(maxF[i - 1] * nums[i], minF[i - 1] * nums[i]));
            minF[i] = Math.min(nums[i], Math.min(maxF[i - 1] * nums[i], minF[i - 1] * nums[i]));
        }
        int ans = maxF[0];
        for (int i = 1; i < length; i++) {
            ans = Math.max(ans, maxF[i]);
        }
        return ans;
    }

}
