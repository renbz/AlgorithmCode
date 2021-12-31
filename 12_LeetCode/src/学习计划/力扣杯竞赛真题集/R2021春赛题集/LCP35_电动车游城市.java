package 学习计划.力扣杯竞赛真题集.R2021春赛题集;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 13:09
 * @Description:
 */

public class LCP35_电动车游城市 {


    public int electricCarPlan(int[][] paths, int cnt, int start, int end, int[] charge) {
        int n = charge.length;

        List<int[]>[] map = new List[n];
        for (int i = 0; i < n; i++) map[i] = new ArrayList();
        for (int[] path : paths) {
            map[path[0]].add(new int[]{path[1], path[2]});
            map[path[1]].add(new int[]{path[0], path[2]});
        }

        int[][] res = new int[n][cnt + 1];
        for (int[] i : res) Arrays.fill(i, Integer.MAX_VALUE / 2);
        res[start][0] = 0;

        Queue<int[]> queue = new PriorityQueue<int[]>((x, y) -> (x[0] - y[0]));
        queue.offer(new int[]{0, start, 0});

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int time = arr[0];
            int cur = arr[1];
            int power = arr[2];

            if (time > res[cur][power]) continue;
            if (cur == end) return time;

            if (power < cnt) {
                int t = time + charge[cur];
                if (t < res[cur][power + 1]) {
                    res[cur][power + 1] = t;
                    queue.offer(new int[]{t, cur, power + 1});
                }
            }

            for (int[] path : map[cur]) {
                int next = path[0];
                int cost = path[1];
                int t = time + cost;
                int p = power - cost;
                if (p >= 0 && t < res[next][p]) {
                    res[next][p] = t;
                    queue.offer(new int[]{t, next, p});
                }
            }

        }

        return -1;
    }
}
