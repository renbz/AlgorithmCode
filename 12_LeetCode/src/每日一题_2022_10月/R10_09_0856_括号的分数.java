package 每日一题_2022_10月;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/10/9 18:58
 * @Description:
 */

public class R10_09_0856_括号的分数 {

    public int scoreOfParentheses(String s) {
        Deque<Integer> st = new ArrayDeque<Integer>();
        st.push(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(0);
            } else {
                int v = st.pop();
                v += Math.max(2 * v, 1);
                st.push(v);
            }
        }
        return st.peek();
    }

}
