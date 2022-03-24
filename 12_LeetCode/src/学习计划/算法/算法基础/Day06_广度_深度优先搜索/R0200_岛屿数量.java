package 学习计划.算法.算法基础.Day06_广度_深度优先搜索;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/11 21:52
 * @Description:
 */

public class R0200_岛屿数量 {

    //使用深度优先搜索
    int count = 0;

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        // 先判断数据坐标是否合法
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return;
        // 将当前的字符变为0，然后深搜四个方向
        grid[i][j] = '0';
        dfs(grid, i - 1, j);//上
        dfs(grid, i + 1, j);//下
        dfs(grid, i, j - 1);//左
        dfs(grid, i, j + 1);//右
    }

}
