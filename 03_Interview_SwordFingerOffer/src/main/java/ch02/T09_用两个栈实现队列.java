package ch02;

import java.util.Stack;

/**
 * @author Ren
 */

public class T09_用两个栈实现队列 {


    Stack<Object> stack1 = new Stack();
    Stack<Object> stack2 = new Stack();

    /**
     * 入队，将栈2中的数据 弹出存入栈1，然后向栈1添加数据
     * @param o
     */
    public void addQueue(Object o){
        if(stack2==null){
            stack1.add(o);
        }else{
            while (stack2!=null){
                stack1.add(stack2.pop());
            }
            stack1.add(o);
        }
    }

    /**
     * 出队，从第二个栈中弹出数据
     * @param o
     * @return
     */
    public Object exitQueue(Object o){
        if(stack1==null){
            return stack2.pop();
        }else{
            while (stack1!=null){
                stack2.add(stack1.pop());
            }
            return stack2.pop();
        }
    }
}
