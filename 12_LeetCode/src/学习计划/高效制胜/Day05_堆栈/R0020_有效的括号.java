package 学习计划.高效制胜.Day05_堆栈;

import java.util.Stack;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 21:47
 * @Description:
 */

public class R0020_有效的括号 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') stack.push(s.charAt(i));
            else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
            else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }

}
