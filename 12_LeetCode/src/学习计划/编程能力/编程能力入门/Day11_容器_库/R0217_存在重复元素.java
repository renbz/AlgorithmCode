package 学习计划.编程能力.编程能力入门.Day11_容器_库;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/3 15:36
 * @Description:
 */

public class R0217_存在重复元素 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }

}
