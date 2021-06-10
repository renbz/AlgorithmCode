package 剑指Offer;

import java.util.Stack;

/**
 * @author Ren
 */

public class R31_栈的压入_弹出序列 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        //将pushed放入栈中
        int index = 0;
        for (int i = 0; i <= pushed.length - 1; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[index]) {
                index++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}