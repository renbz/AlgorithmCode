package 每日一题_2022_10月;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/10/22 19:05
 * @Description:
 */

public class R10_21_0901_股票价格跨度 {

    class StockSpanner {
        Deque<int[]> stack;
        int idx;

        public StockSpanner() {
            stack = new ArrayDeque<int[]>();
            stack.push(new int[]{-1, Integer.MAX_VALUE});
            idx = -1;
        }

        public int next(int price) {
            idx++;
            while (price >= stack.peek()[1]) {
                stack.pop();
            }
            int ret = idx - stack.peek()[0];
            stack.push(new int[]{idx, price});
            return ret;
        }
    }

}
