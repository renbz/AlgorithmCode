package 学习计划.剑指Offer;

import java.util.Stack;

/**
 * @author Ren
 */

public class R09_用两个栈实现队列 {

    Stack<Integer> stack1 = null;
    Stack<Integer> stack2 = null;

    public R09_用两个栈实现队列() {
        stack1 = new Stack();
        stack2 = new Stack();

    }

    public void appendTail(int value) {
        if(stack2.isEmpty()){
            stack1.add(value);
        }else{
            while (!stack2.isEmpty()){
                stack1.add(stack2.pop());
            }
            stack1.add(value);
        }
    }

    public int deleteHead() {
        if(stack1.isEmpty()){
            if(stack2.isEmpty()) return -1;
            return stack2.pop();
        }else{
            while (!stack1.isEmpty()){
                stack2.add(stack1.pop());
            }
            return stack2.pop();
        }
    }



    //方法二
    class CQueue {

        //两个栈，一个出栈，一个入栈
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public CQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if(!stack2.isEmpty()){
                return stack2.pop();
            }else{
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                return stack2.isEmpty() ? -1 : stack2.pop();
            }
        }
    }
}
