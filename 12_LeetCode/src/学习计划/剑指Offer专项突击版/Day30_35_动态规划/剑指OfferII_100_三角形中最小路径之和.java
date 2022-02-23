package 学习计划.剑指Offer专项突击版.Day30_35_动态规划;

import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/23 21:38
 * @Description:
 */

public class 剑指OfferII_100_三角形中最小路径之和 {

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
