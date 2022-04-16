package 每日一题_2022_04月;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/15 14:41
 * @Description:
 */

public class R04_15_0385_迷你语法分析器 {


    public NestedInteger deserialize(String s) {
        if (!s.startsWith("[")) return new NestedInteger(Integer.parseInt(s));
        Deque<NestedInteger> stack = new ArrayDeque<>();
        NestedInteger res = new NestedInteger();
        stack.push(res);
        int l = 1, r = 1;
        for (; r < s.length(); r++) {
            char ch = s.charAt(r);
            if (ch == '[') {
                NestedInteger ni = new NestedInteger();
                l = r + 1;
                stack.peek().add(ni);
                stack.push(ni);
            } else if (ch == ']' || ch == ',') {
                if (l < r) {
                    Integer val = Integer.valueOf(s.substring(l, r));
                    stack.peek().add(new NestedInteger(val));
                }
                l = r + 1;
                if (ch == ']') stack.pop();
            }
        }
        return res;
    }

    class NestedInteger {
        // Constructor initializes an empty nested list.
        public NestedInteger() {
        }


        // Constructor initializes a single integer.
        public NestedInteger(int value) {
        }


        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger() {
            return true;
        }

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger() {
            return -1;
        }

        // Set this NestedInteger to hold a single integer.
        public void setInteger(int value) {

        }

        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        public void add(NestedInteger ni) {

        }

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList() {
            return null;
        }
    }

}

