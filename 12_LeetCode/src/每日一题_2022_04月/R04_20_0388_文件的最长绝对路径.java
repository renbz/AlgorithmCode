package 每日一题_2022_04月;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/20 15:49
 * @Description:
 */

public class R04_20_0388_文件的最长绝对路径 {

    public int lengthLongestPath(String input) {
        int n = input.length(), pos = 0, ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        while (pos < n) {
            // 检测当前文件的深度
            int depth = 1;
            while (pos < n && input.charAt(pos) == '\t') {
                pos++;
                depth++;
            }
            // 统计当前文件名的长度
            boolean isFile = false;
            int len = 0;
            while (pos < n && input.charAt(pos) != '\n') {
                if (input.charAt(pos) == '.') {
                    isFile = true;
                }
                len++;
                pos++;
            }
            /* 跳过当前的换行符 */
            pos++;

            while (stack.size() >= depth) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                len += stack.peek() + 1;
            }
            if (isFile) {
                ans = Math.max(ans, len);
            } else {
                stack.push(len);
            }
        }
        return ans;
    }

}
