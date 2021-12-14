package 学习计划.数据结构入门.Day01_数组;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/13 11:37
 * @Description:
 */

public class R0217_存在重复元素 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

}
