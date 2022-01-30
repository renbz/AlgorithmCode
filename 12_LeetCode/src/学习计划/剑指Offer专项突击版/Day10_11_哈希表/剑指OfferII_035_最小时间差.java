package 学习计划.剑指Offer专项突击版.Day10_11_哈希表;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/30 22:01
 * @Description:
 */

public class 剑指OfferII_035_最小时间差 {

    public int findMinDifference(List<String> timePoints) {
        List<Integer> list = new ArrayList<>();
        for (String timePoint : timePoints) {
            Integer a = Integer.valueOf(timePoint.substring(0, 2));
            Integer b = Integer.valueOf(timePoint.substring(3, 5));
            list.add(a * 60 + b);
        }
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }
        min = Math.min(min,24*60-list.get(list.size()-1)+list.get(0));
        return min;
    }

}
