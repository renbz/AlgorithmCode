package 学习计划.高效制胜.Day05_堆栈;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/6 18:47
 * @Description:
 */

public class R0456_132模式 {

    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Deque<Integer> d = new ArrayDeque<>();
        int k = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < k) return true;
            while (!d.isEmpty() && d.peekLast() < nums[i]) {
                k = Math.max(k, d.pollLast());
            }
            d.addLast(nums[i]);
        }
        return false;
    }

}
