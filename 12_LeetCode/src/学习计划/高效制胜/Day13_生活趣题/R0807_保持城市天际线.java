package 学习计划.高效制胜.Day13_生活趣题;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/15 10:04
 * @Description:
 */

public class R0807_保持城市天际线 {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] h_max = new int[grid.length];
        int[] s_max = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                h_max[i] = Math.max(h_max[i], grid[i][j]);
                s_max[j] = Math.max(s_max[j], grid[i][j]);
            }
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int min = Math.min(h_max[i], s_max[j]);
                count += min - grid[i][j];
            }
        }
        return count;
    }

}
