package 每日一题_2021_9月;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren
 */

public class R09_13_0447_回旋镖的数量 {

    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        for (int[] p : points) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int[] q : points) {
                int dis = (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
                map.put(dis, map.getOrDefault(dis, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int m = entry.getValue();
                ans += m * (m - 1);
            }
        }
        return ans;
    }
}
