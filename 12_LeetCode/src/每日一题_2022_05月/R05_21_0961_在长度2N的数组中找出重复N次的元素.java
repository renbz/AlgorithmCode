package 每日一题_2022_05月;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/21 17:01
 * @Description:
 */

public class R05_21_0961_在长度2N的数组中找出重复N次的元素 {

    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(!set.add(num)) return num;
        }
        return 0;
    }

}
