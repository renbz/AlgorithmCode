package 每日一题_2022_04月;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/25 12:49
 * @Description:
 */

public class R04_25_0398_随机数索引 {

    class Solution {
        Map<Integer, List<Integer>> pos;
        Random random;

        public Solution(int[] nums) {
            pos = new HashMap<Integer, List<Integer>>();
            random = new Random();
            for (int i = 0; i < nums.length; ++i) {
                pos.putIfAbsent(nums[i], new ArrayList<Integer>());
                pos.get(nums[i]).add(i);
            }
        }

        public int pick(int target) {
            List<Integer> indices = pos.get(target);
            return indices.get(random.nextInt(indices.size()));
        }
    }

}
