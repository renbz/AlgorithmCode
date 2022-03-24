package 学习计划.数据结构.数据结构入门.Day09_栈_队列;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/22 14:17
 * @Description:
 */

public class R0232_用栈实现队列 {

    class MyQueue {
        Stack<Integer> inStack;
        Stack<Integer> outStack;

        public MyQueue() {
            inStack = new Stack<>();
            outStack = new Stack<>();
        }

        public void push(int x) {
            inStack.push(x);
        }

        public int pop() {
            if (outStack.isEmpty()) {
                in2out();
            }
            return outStack.pop();
        }

        public int peek() {
            if (outStack.isEmpty()) {
                in2out();
            }
            return outStack.peek();
        }

        public boolean empty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }

        private void in2out() {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}
