package LeetCode周赛.第375场;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2023/12/10 10:51
 * @Description:
 */

public class R100137_统计最大元素出现至少K次的子数组 {

    private static int ans = 0;

    public static int countSubarrays(int[] nums, int k) {
        // 寻找max
        int maxNum = Arrays.stream(nums).max().getAsInt();
        long count = Arrays.stream(nums).filter(x -> x == maxNum).count();
        if (count < k) return 0;
        // 找到内部k的l  r索引相乘+count-k
        // 双指针
        int t = 0;
        int oneIndex = 0;
        int kIndex = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (maxNum == nums[i]) t++;
            if (t == 1) {
                oneIndex = i;
            } else if (t == k) {
                kIndex = i;
                break;
            }
        }
        ans += (oneIndex + 1) * (nums.length - kIndex);
        if (nums.length != kIndex) {
            ans += countSubarrays(Arrays.copyOfRange(nums, oneIndex , nums.length), k, maxNum);
        }
        return ans;
    }

    public static int countSubarrays(int[] nums, int k, int maxNum) {
        System.out.println(Arrays.toString(nums));
        long count = Arrays.stream(nums).filter(x -> x == maxNum).count();
        if (count < k) return 0;
        // 找到内部k的l  r索引相乘+count-k
        // 双指针
        int t = 0;
        int oneIndex = 0;
        int kIndex = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (maxNum == nums[i]) t++;
            if (t == 1) {
                oneIndex = i;
            } else if (t == k) {
                kIndex = i;
                break;
            }
        }
        if (nums.length != kIndex) {
            return (oneIndex + 1) * (nums.length - kIndex) + countSubarrays(Arrays.copyOfRange(nums, oneIndex+1, nums.length), k);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 2, 3, 3};
        int k1 = 2;
        System.out.println(countSubarrays(nums1, k1));  // 输出：6

        int[] nums2 = {1, 4, 2, 1};
        int k2 = 3;
        System.out.println(countSubarrays(nums2, k2));  // 输出：0
    }


}
