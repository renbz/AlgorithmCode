package Other;

import java.util.Stack;

/**
 * @author Ren
 */

public class R0155_最小栈 {

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
