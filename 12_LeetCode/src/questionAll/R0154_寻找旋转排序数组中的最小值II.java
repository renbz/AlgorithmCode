package questionAll;

/**
 * @author Ren
 */

public class R0154_寻找旋转排序数组中的最小值II {

    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = min>nums[i]?nums[i]:min;
        }
        return min;
    }

}
