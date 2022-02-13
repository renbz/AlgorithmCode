package 学习计划.剑指Offer专项突击版.Day25_26_排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/13 15:47
 * @Description:
 */

public class 剑指OfferII_074_合并区间 {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> list = new ArrayList<>();

        int i = 0;
        while (i < intervals.length) {
            int l = intervals[i][0];
            int r = intervals[i][1];
            while (i < intervals.length - 1 && intervals[i + 1][0] <= r) {
                i++;
                r = Math.max(r, intervals[i][1]);
            }
            list.add(new int[]{l, r});
            i++;
        }
        return list.toArray(new int[0][]);
    }

}
