package 每日一题_2022_04月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/26 15:57
 * @Description:
 */

public class R04_26_0883_三维形体投影面积 {

    public int projectionArea(int[][] grid) {
        // [1,2]
        // [3,4]
        //俯视图为grid的元素个数(Z)，正视图为每行最大值(X)，左视图为每列最大值(Y)
        int len = grid.length, count_x = 0, count_y = 0, count_z = len * len;
        for (int i = 0; i < len; i++) {
            count_x += Arrays.stream(grid[i]).max().getAsInt();
            // 列的最大值
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < len; j++) {
                max = Math.max(max, grid[j][i]);
                if (grid[j][i] == 0) count_z--;
            }
            count_y += max;
        }
        return count_x + count_y + count_z;
    }

}
