package 学习计划.剑指Offer专项突击版.Day16_19_树;

import java.util.TreeMap;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/11 09:16
 * @Description:
 */

public class 剑指OfferII_058_日程表 {

    class MyCalendar {

        TreeMap<Integer, Integer> calendar;

        public MyCalendar() {
            calendar = new TreeMap<>();
        }

        public boolean book(int start, int end) {
            Integer prev = calendar.floorKey(start), next = calendar.ceilingKey(start);
            if ((prev == null || calendar.get(prev) <= start) && (next == null || end <= next)) {
                calendar.put(start, end);
                return true;
            }
            return false;
        }
    }

}
