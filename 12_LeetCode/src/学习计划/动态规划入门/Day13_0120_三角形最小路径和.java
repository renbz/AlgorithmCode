package 学习计划.动态规划入门;

import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/18 10:21
 * @Description:
 */

public class Day13_0120_三角形最小路径和 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size(), n = triangle.get(0).size();
        for (int i = m - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
