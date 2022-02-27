package 学习计划.剑指Offer专项突击版.Day36_40_图;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/27 23:31
 * @Description:
 */

public class 剑指OfferII_107_矩阵中的距离 {

    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] res = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    res[i][j] = -1; // 初始化为-1，用于后续判断
                }
            }
        }
        int dis = 0;
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!queue.isEmpty()) {
            dis++;
            int size = queue.size();
            while (size-- > 0) {
                int[] cur = queue.poll();
                for (int[] dir : directions) {
                    int x = cur[0] + dir[0], y = cur[1] + dir[1];
                    if (x < 0 || x == m || y < 0 || y == n || res[x][y] != -1) continue;
                    res[x][y] = dis;
                    queue.offer(new int[]{x, y});
                }
            }
        }
        return res;
    }
}
