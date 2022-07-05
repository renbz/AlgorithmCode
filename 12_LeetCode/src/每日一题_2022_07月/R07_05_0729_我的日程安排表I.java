package 每日一题_2022_07月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/5 08:49
 * @Description:
 */

public class R07_05_0729_我的日程安排表I {

    class MyCalendar {

        List<int[]> booked;

        public MyCalendar() {
            booked = new ArrayList<int[]>();
        }

        public boolean book(int start, int end) {
            for (int[] arr : booked) {
                int l = arr[0], r = arr[1];
                if (l < end && start < r) {
                    return false;
                }
            }
            booked.add(new int[]{start, end});
            return true;
        }
    }

}
