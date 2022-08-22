package 每日一题_2022_08月;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/22 22:46
 * @Description:
 */

public class R08_13_0768_最多能完成排序的块II {

    public int maxChunksToSorted(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int num : arr) {
            if (stack.isEmpty() || num >= stack.peek()) {
                stack.push(num);
            } else {
                int mx = stack.pop();
                while (!stack.isEmpty() && stack.peek() > num) {
                    stack.pop();
                }
                stack.push(mx);
            }
        }
        return stack.size();
    }

}
