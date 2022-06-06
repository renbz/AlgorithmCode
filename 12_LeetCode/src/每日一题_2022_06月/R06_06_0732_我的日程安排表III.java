package 每日一题_2022_06月;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/6 20:28
 * @Description:
 */

public class R06_06_0732_我的日程安排表III {

    class MyCalendarThree {

        private TreeMap<Integer, Integer> cnt;

        public MyCalendarThree() {
            cnt = new TreeMap<>();
        }

        public int book(int start, int end) {
            int ans = 0;
            int maxBook = 0;
            cnt.put(start, cnt.getOrDefault(start,0)+1);
            cnt.put(end, cnt.getOrDefault(end,0)-1);
            for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
                int freq = entry.getValue();
                maxBook += freq;
                ans = Math.max(maxBook,ans);
            }
            return ans;
        }
    }


}
