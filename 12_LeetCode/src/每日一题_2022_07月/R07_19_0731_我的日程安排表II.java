package 每日一题_2022_07月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/19 19:38
 * @Description:
 */

public class R07_19_0731_我的日程安排表II {

    class MyCalendarTwo {
        List<int[]> booked;
        List<int[]> overlaps;

        public MyCalendarTwo() {
            booked = new ArrayList<int[]>();
            overlaps = new ArrayList<int[]>();
        }

        public boolean book(int start, int end) {
            for (int[] arr : overlaps) {
                int l = arr[0], r = arr[1];
                if (l < end && start < r) {
                    return false;
                }
            }
            for (int[] arr : booked) {
                int l = arr[0], r = arr[1];
                if (l < end && start < r) {
                    overlaps.add(new int[]{Math.max(l, start), Math.min(r, end)});
                }
            }
            booked.add(new int[]{start, end});
            return true;
        }
    }

}
