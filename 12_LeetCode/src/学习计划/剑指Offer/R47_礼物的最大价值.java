package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R47_礼物的最大价值 {

    public int maxValue(int[][] grid) {
        int rowNums = grid.length;
        int lieNums = grid[0].length;
        for (int i = 1; i < rowNums; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < lieNums; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        for (int i = 1; i < rowNums; i++) {
            for (int j = 1; j < lieNums; j++) {
                grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[rowNums - 1][lieNums - 1];
    }

}
