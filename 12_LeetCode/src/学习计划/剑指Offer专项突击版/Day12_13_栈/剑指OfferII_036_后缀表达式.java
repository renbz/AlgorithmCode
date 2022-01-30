package 学习计划.剑指Offer专项突击版.Day12_13_栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/30 22:11
 * @Description:
 */

public class 剑指OfferII_036_后缀表达式 {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (String s : tokens) {
            if ("+".equals(s)) {
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(s)) {
                stack.push(-stack.pop() + stack.pop());
            } else if ("*".equals(s)) {
                stack.push(stack.pop() * stack.pop());
            }else if("/".equals(s)){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

}
