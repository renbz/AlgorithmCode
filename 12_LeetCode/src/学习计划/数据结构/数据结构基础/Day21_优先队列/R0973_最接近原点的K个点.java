package 学习计划.数据结构.数据结构基础.Day21_优先队列;

import java.util.PriorityQueue;

/**
 * @author Ren
 */

public class R0973_最接近原点的K个点 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
        for (int i = 0; i < points.length; i++) {
            int distance = (int) (Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
            minHeap.add(new int[]{distance,i});
        }
        int [][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] arr = minHeap.poll();
            ans[i][0] = points[arr[1]][0];
            ans[i][1] = points[arr[1]][1];
        }
        return ans;
    }

}
