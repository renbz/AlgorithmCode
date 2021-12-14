package 每日一题_2021_12月;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/14 17:12
 * @Description:
 */

public class R12_14_0630_课程表III {

    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (c1, c2) -> c1[1] - c2[1]);
        PriorityQueue<int[]> heap = new PriorityQueue<>((c1, c2) -> c2[0] - c1[0]);
        int day = 0;
        for (int[] cours : courses) {
            // 如果没有冲突,即当前课程可以在不超出期限的情况下排课
            if (day + cours[0] <= cours[1]) {
                heap.offer(cours);
                day += cours[0];
            } else if (!heap.isEmpty() && heap.peek()[0] > cours[0]) {
                day -= heap.poll()[0] - cours[0];
                heap.offer(cours);
            }
        }
        return heap.size();
    }
}
