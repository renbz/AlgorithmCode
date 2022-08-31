package 每日一题_2022_08月;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/31 19:48
 * @Description:
 */

public class R08_31_0946_验证栈序列 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int n = pushed.length;
        for (int i = 0, j = 0; i < n; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

}
