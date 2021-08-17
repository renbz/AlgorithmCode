package 学习计划.数据结构基础.Day14_栈_队列;

import java.util.Stack;

/**
 * @author Ren
 */

public class R0155_最小栈 {
    /**
     * initialize your data structure here.
     */
    class MinStack {
        Stack<Integer> stackA, stackB;

        public MinStack() {
            stackA = new Stack<>();
            stackB = new Stack<>();
        }

        public void push(int x) {
            stackA.push(x);
            if (stackB.isEmpty() || stackB.peek() >= x) stackB.push(x);
        }

        public void pop() {
            if (stackA.peek().equals(stackB.peek())) stackB.pop();
            stackA.pop();
        }

        public int top() {
            return stackA.peek();
        }

        public int getMin() {
            return stackB.peek();
        }
    }

}
