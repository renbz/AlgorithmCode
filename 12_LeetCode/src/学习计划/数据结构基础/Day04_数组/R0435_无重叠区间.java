package 学习计划.数据结构基础.Day04_数组;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R0435_无重叠区间 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[1] - o2[1]);
        // 只要区间重合 移除后者
        int count = 0, preIndex = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[preIndex][1]) {
                count++;
            } else {
                preIndex = i;
            }
        }
        return count;

    }
}
