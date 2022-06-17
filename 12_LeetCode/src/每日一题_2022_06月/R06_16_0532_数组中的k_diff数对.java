package 每日一题_2022_06月;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/16 23:21
 * @Description:
 */

public class R06_16_0532_数组中的k_diff数对 {

    public int findPairs(int[] nums, int k) {
        Set<Integer> visited = new HashSet<Integer>();
        Set<Integer> res = new HashSet<Integer>();
        for (int num : nums) {
            if (visited.contains(num - k)) {
                res.add(num - k);
            }
            if (visited.contains(num + k)) {
                res.add(num);
            }
            visited.add(num);
        }
        return res.size();
    }

}
