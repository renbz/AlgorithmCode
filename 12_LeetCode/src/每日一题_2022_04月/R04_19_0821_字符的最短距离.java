package 每日一题_2022_04月;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/19 14:09
 * @Description:
 */

public class R04_19_0821_字符的最短距离 {

    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] ans = new int[len];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == c) {
                queue.add(i);
            }
        }
        final int size = queue.size();
        int t = queue.poll();

        for (int i = 0; i < len; i++) {
            if (!queue.isEmpty() && Math.abs(t - i) <= Math.abs(queue.peek() - i)) {
                ans[i] = Math.abs(t - i);
            } else if ((!queue.isEmpty() && Math.abs(t - i) > Math.abs(queue.peek() - i))) {
                t = queue.poll();
                ans[i] = Math.abs(t - i);
            } else {
                ans[i] = Math.abs(t - i);
            }
        }
        return ans;
    }

}
