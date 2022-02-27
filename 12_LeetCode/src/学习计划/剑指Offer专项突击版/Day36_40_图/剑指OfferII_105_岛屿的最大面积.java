package 学习计划.剑指Offer专项突击版.Day36_40_图;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/27 22:43
 * @Description:
 */

public class 剑指OfferII_105_岛屿的最大面积 {

    int[][] grid;
    int m, n, count = 0;

    public int maxAreaOfIsland(int[][] grid) {
        this.m = grid.length;
        this.n = grid[0].length;
        this.grid = grid;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(i, j);
                    ans = Math.max(count, ans);
                    count = 0;
                }
            }
        }
        return ans;
    }

    private void dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) return ;
        else {
            count++;
            grid[i][j] = 0;
            dfs(i - 1, j);
            dfs(i + 1, j);
            dfs(i, j + 1);
            dfs(i, j - 1);
        }
    }
}
