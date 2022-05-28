package 每日一题_2022_05月;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/28 21:31
 * @Description:
 */

public class R05_28_1021_删除最外层的括号 {

    public String removeOuterParentheses(String s) {
        StringBuffer ans = new StringBuffer();
        Deque<Character> queue = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                queue.pop();
            }
            if (!queue.isEmpty()) {
                ans.append(c);
            }
            if (c == '(') {
                queue.push(c);
            }
        }
        return ans.toString();
    }

}
