package 每日一题_2022_03月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/24 09:30
 * @Description:
 */

public class R03_24_0661_图片平滑器 {

    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length, ti = 0, tj = 0;
        int[][] ans = new int[m][n];
        int[][] dirs = new int[][]{{0, 0}, {0, 1}, {0, -1}, {1, -1}, {1, 1}, {1, 0}, {-1, 1}, {-1, -1}, {-1, 0}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0, count = 0;
                for (int[] dir : dirs) {
                    ti = dir[0] + i;
                    tj = dir[1] + j;
                    if (ti >= 0 && ti < m && tj >= 0 && tj < n) {
                        sum += img[ti][tj];
                        count++;
                    } else {
                        continue;
                    }
                }
                ans[i][j] = sum / count;
            }
        }
        return ans;
    }
}
