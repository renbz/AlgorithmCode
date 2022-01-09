package LeetCode周赛.第275场;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/9 10:47
 * @Description:
 */

public class R5977_最少交换次数来组合所有的1_II {
    public int minSwaps(int[] nums) {
        int count = 0, max = 0, len = nums.length, l1 = 0, l2 = 0;
        for (int i = 0; i < len; i++) {
            int value = 0;
            if (nums[i] == 0) {
                l2 = i;
            } else {
                count++;
                value++;
                max = Math.max(max, value);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(nums[i]);
        }


        if (nums[0] == 1 && nums[nums.length - 1] == 1) {
            l1 = builder.toString().indexOf('0');
            l2 = builder.toString().lastIndexOf('0');
            max = Math.max(max, l1 + len - l2);
        } else {

        }
        return count - max;
    }


}
