package 每日一题_2022_02月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/12 14:50
 * @Description:
 */

public class R02_12_1020_飞地的数量 {

    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int[][] grid;
    int m, n;

    public int numEnclaves(int[][] grid) {
        //从四周遍历 将1变成0，然后统计1的数量
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        for (int i = 0; i < m; i++) {
            dfs(i, 0);
            dfs(i, n - 1);
        }
        for (int i = 0; i < n; i++) {
            dfs(0, i);
            dfs(m - 1, i);
        }
        int ans = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (grid[i][j] == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }

    void dfs(int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) return;
        else grid[i][j] = 0;
        for (int[] dir : dirs) dfs(i + dir[0], j + dir[1]);
    }

}
