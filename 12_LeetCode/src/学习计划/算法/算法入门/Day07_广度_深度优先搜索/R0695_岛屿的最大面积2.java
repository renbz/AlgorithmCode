package 学习计划.算法.算法入门.Day07_广度_深度优先搜索;

/**
 * @author Ren
 */

public class R0695_岛屿的最大面积2 {
    int lenI, lenJ;

    public int maxAreaOfIsland(int[][] grid) {
        lenI = grid.length;
        lenJ = grid[0].length;
        int max = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1) max = Math.max(max, dfs(grid, i, j));
        return max;
    }

    int dfs(int[][] grid, int i, int j) {
        if (grid[i][j] != 1) return 0;
        grid[i][j] = 2;
        int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
        if (i > 0) t1 = dfs(grid, i - 1, j);
        if (j > 0) t2 = dfs(grid, i, j - 1);
        if (i < lenI - 1) t3 = dfs(grid, i + 1, j);
        if (j < lenJ - 1) t4 = dfs(grid, i, j + 1);
        return t1 + t2 + t3 + t4 + 1;
    }

}
