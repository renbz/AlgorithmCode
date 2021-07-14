package 学习计划.剑指Offer;

import java.util.Stack;

/**
 * @author Ren
 */

public class R30_包含min函数的栈 {

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
            if (stackA.peek() == stackB.peek()) stackB.pop();
            stackA.pop();
        }

        public int top() {
            return stackA.peek();
        }

        public int min() {
            return stackB.peek();
        }
    }

}
