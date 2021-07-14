package 学习计划.剑指Offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren
 */

public class R03_数组中重复的数字 {

    /**
     * set判重
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }
        return 0;
    }

    /**
     * 原地交换
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber2(int[] nums) {
        int  temp = 0;
        for (int i = 0;i < nums.length;i++) {
            while (i != nums[i]) {
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        return -1;
    }

}
