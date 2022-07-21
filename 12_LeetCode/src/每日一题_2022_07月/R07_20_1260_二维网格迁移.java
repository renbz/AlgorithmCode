package 每日一题_2022_07月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/20 20:10
 * @Description:
 */

public class R07_20_1260_二维网格迁移 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            ret.add(row);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int index1 = (i * n + j + k) % (m * n);
                ret.get(index1 / n).set(index1 % n, grid[i][j]);
            }
        }
        return ret;
    }

}
