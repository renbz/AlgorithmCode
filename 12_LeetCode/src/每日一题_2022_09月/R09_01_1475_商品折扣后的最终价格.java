package 每日一题_2022_09月;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/9/1 20:57
 * @Description:
 */

public class R09_01_1475_商品折扣后的最终价格 {

    public int[] finalPrices(int[] ps) {
        int n = ps.length;
        int[] ans = new int[n];
        Deque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!d.isEmpty() && ps[d.peekLast()] >= ps[i]) {
                int idx = d.pollLast();
                ans[idx] = ps[idx] - ps[i];
            }
            d.addLast(i);
            ans[i] = ps[i];
        }
        return ans;
    }

}
